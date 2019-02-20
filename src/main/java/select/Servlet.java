package select;

import entity.Pet;
import service.PetService;
import service.impl.PetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
@WebServlet(name = "Servlet",urlPatterns = "/select")
public class Servlet extends HttpServlet {
    PetService am=new PetServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String type=request.getParameter("type");
        if(type==null || type.equals("select")){
            select(request,response);
        }else if (type.equals("selectall")){
            selectall(request,response);
        }else if (type.equals("insert")){
           insert(request,response);
        }
    }

    public  void  select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Pet>list= am.select();
       request.getSession().setAttribute("list",list);
       response.sendRedirect("1.jsp");
    }
    public  void  selectall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String pinzhong=request.getParameter("pin");
         int pin=Integer.valueOf(pinzhong);
        System.out.println(pin);
        List<Pet>list=am.selectall(pin);
        System.out.println(list);
        request.getSession().setAttribute("list",list);
        response.sendRedirect("1.jsp");
    }
    public  void  insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        String name=request.getParameter("uname");
       String pinzong= request.getParameter("pin");
       String xingbie=request.getParameter("xing");
       String riqi=request.getParameter("riqi");
       String mianshu=request.getParameter("mian");
        Date qi=Date.valueOf(riqi);
       int xing=Integer.valueOf(xingbie);
       int pin=Integer.valueOf(pinzong);
        Pet ab=new Pet();
        ab.setPetnamee(name);
        ab.setPetbreed(pin);
        ab.setPetsex(xing);
        ab.setBirthday(qi);
        ab.setDescription(mianshu);
       int ac= am.insert(ab);
        if (ac == 1) {
            System.out.println("增加成功");
        }else {
            System.out.println("增加失败");
        }
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
