package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.team1.BirdPee.DTO.Feedback;
import com.team1.BirdPee.DTO.Shop;
import com.team1.BirdPee.DAO.BirdPeeDAO;
import com.team1.BirdPee.DTO.Account;

public final class SO_005fFeedbackManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/SO_FeedbackManagement.css\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            href=\"https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"images/logo2.png\" />\n");
      out.write("        <title>BirdPee - Shop Owner</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Account ac = (Account) session.getAttribute("user");
            if (session.getAttribute("user") == null) {
                response.sendRedirect("Login.jsp");
            } else {
                Shop s = BirdPeeDAO.SHOPOWNER_findShopByOwnerId(ac.getId());
        
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <i class=\"bx bx-menu menu-icon\"></i>\n");
      out.write("                <span class=\"logo-name\">FEEDBACK MANAGEMENT</span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"user-info\">\n");
      out.write("                <img src=\"https://cdn-icons-png.flaticon.com/512/552/552721.png\" alt=\"\" />\n");
      out.write("                <h3>");
      out.print( ac.getUsername());
      out.write("</h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <i class=\"bx bx-menu menu-icon overlay\"></i>\n");
      out.write("                    <span class=\"logo-name\">BIRDPEE</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"sidebar-content\">\n");
      out.write("                    <ul class=\"lists\">\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"SO_Dashboard.jsp\" class=\"nav-link\">\n");
      out.write("                                <i class=\"bx bxs-spreadsheet icon\"></i>\n");
      out.write("                                <span class=\"link\">DASHBOARD</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"SO_ProductManagement.jsp\" class=\"nav-link\">\n");
      out.write("                                <i class=\"icon bx bxs-package\"></i>\n");
      out.write("                                <span class=\"link\">PRODUCT MANAGEMENT</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"SO_CustomerManagement.jsp\" class=\"nav-link\">\n");
      out.write("                                <i class=\"icon bx bxs-package\"></i>\n");
      out.write("                                <span class=\"link\">CUSTOMER MANAGEMENT</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"SO_ShopProfileManagement.jsp?provinceid=");
      out.print( BirdPeeDAO.SHIP_getProvinceIDByShopID(s.getId()).trim());
      out.write("&districtid=");
      out.print( BirdPeeDAO.SHIP_getDistrictIDByShopID(s.getId()).trim());
      out.write("\" class=\"nav-link\">\n");
      out.write("                                <i class=\"bx bxs-store-alt icon\"></i>\n");
      out.write("                                <span class=\"link\">SHOP PROFILE</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                                <i class=\"bx bxs-comment icon\"></i>\n");
      out.write("                                <span class=\"link\">FEEDBACK MANAGEMENT</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"SO_OrderManagement.jsp\" class=\"nav-link\">\n");
      out.write("                                <i class=\"bx bx-notepad icon\"></i>\n");
      out.write("                                <span class=\"link\">ORDER MANAGEMENT</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list\">\n");
      out.write("                            <a href=\"Login.jsp\" class=\"nav-link\">\n");
      out.write("                                <i class=\"bx bx-log-out icon\"></i>\n");
      out.write("                                <span class=\"link\">LOGOUT</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"main-container\">\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h1>Shop's Feedback</h1>\n");
      out.write("                    <div class=\"rate\">\n");
      out.write("                        <span class=\"score\">");
      out.print( BirdPeeDAO.SHOPOWNER_getRating(s.getId()));
      out.write("</span>\n");
      out.write("                        <span class=\"total\">/ 5</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"sort-reply\">\n");
      out.write("                        <div><a href=\"SO_FeedbackManagement.jsp\" class=\"");
      out.print( request.getParameter("sort") == null ? "active" : "" );
      out.write("\">All</a></div>\n");
      out.write("                        <div><a href=\"SO_FeedbackManagement.jsp?sort=replied\" class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("replied") ? "active" : "" );
      out.write("\">Replied</a></div>\n");
      out.write("                        <div><a href=\"SO_FeedbackManagement.jsp?sort=notreply\" class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("noreplied") ? "active" : "" );
      out.write("\">Not Reply</a></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"sort-rating\">\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") == null ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp\">All</a></div>\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("5") ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp?sort=5\">5 stars</a></div>\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("4") ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp?sort=4\">4 Stars</a></div>\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("3") ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp?sort=3\">3 Stars</a></div>\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("2") ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp?sort=2\">2 Stars</a></div>\n");
      out.write("                        <div class=\"");
      out.print( request.getParameter("sort") != null && request.getParameter("sort").equalsIgnoreCase("1") ? "active" : "" );
      out.write("\"><a href=\"SO_FeedbackManagement.jsp?sort=1\">1 Stars</a></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"feedback-place\">\n");
      out.write("                        <div class=\"table-section\">\n");
      out.write("                            <table>\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Product ID</td>\n");
      out.write("                                        <td>Customer's email</td>\n");
      out.write("                                        <td>Create date</td>\n");
      out.write("                                        <td>Feedback</td>\n");
      out.write("                                        <td>Rating</td>\n");
      out.write("                                        <td>Shop's Reply</td>\n");
      out.write("                                        <td>Status</td>\n");
      out.write("                                        <td>Action</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody class=\"tbody\">\n");
      out.write("                                    ");

                                        ArrayList<Feedback> listF = BirdPeeDAO.SHOPOWNER_getAllFeedbackByOwnerIDAndSort(ac.getId(), request.getParameter("sort"));
                                        for (Feedback feedback : listF) {
                                    
      out.write("\n");
      out.write("                                <form action=\"BirdPee\" method=\"post\">\n");
      out.write("                                    <tr class=\"tr\">\n");
      out.write("                                        <td><a href=\"SO_ProductManagement.jsp?id=");
      out.print( feedback.getProductID() );
      out.write("\" style=\"text-decoration: underline\">");
      out.print( feedback.getProductID());
      out.write("</a></td>\n");
      out.write("                                        <td>");
      out.print( BirdPeeDAO.ACCOUNT_getCustomerByID(feedback.getCustomerID()).getEmail());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( BirdPeeDAO.DATESTRINGCONVERTER_convertUtilDateToStringInCheckOut(feedback.getCreateDate(), 0) );
      out.write("</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <textarea name=\"\" id=\"\" cols=\"30\" rows=\"10\" readonly>");
      out.print( feedback.getComment());
      out.write("</textarea>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>");
      out.print( feedback.getRating());
      out.write("</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <textarea name=\"reply\" id=\"\" cols=\"30\" rows=\"10\" ");
      out.print( feedback.getStatus() == 0 ? "" : "readonly");
      out.write('>');
      out.print( feedback.getStatus() == 0 ? "" : feedback.getReply());
      out.write("</textarea>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><div class=\"");
      out.print( feedback.getStatus() == 0 ? "not-approve" : "approve");
      out.write('"');
      out.write('>');
      out.print( feedback.getStatus() == 0 ? "Not Reply" : "Replied");
      out.write("</div></td>\n");
      out.write("                                        <td>    \n");
      out.write("                                            ");

                                                if (feedback.getStatus() == 0) {
                                            
      out.write("\n");
      out.write("                                            <input type=\"hidden\" name=\"fid\" value=\"");
      out.print( feedback.getId() );
      out.write("\"/>\n");
      out.write("                                            <button name=\"action\" value=\"SOReplyFeedback\">Send</button>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </form>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shadow\"></div>\n");
      out.write("        </main>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <script src=\"js/SO_FeedbackManagement.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
