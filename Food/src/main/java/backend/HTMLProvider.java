package backend;

public class HTMLProvider {
	
	
//	String s="";	
//	static {
//		
//		
//	}
//	
	public static String getIndex() {

		String s="<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <title>Bootstrap demo </title>\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "    integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "    \r\n"
				+ "    <div class=\"container-fluid\">\r\n"
				+ "      <a class=\"navbar-brand\" href=\"#\">Saloon</a>\r\n"
				+ "      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n"
				+ "        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "        <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "      </button>\r\n"
				+ "      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link active\" aria-current=\"page\" href=\"/\">Home</a>\r\n"
				+ "          </li>\r\n"
				+ "         \r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link\" href=\"/about.html\">About</a>\r\n"
				+ "          </li>\r\n"
				+ "          <!-- <li class=\"nav-item dropdown\">\r\n"
				+ "            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "              Dropdown\r\n"
				+ "            </a>\r\n"
				+ "            <ul class=\"dropdown-menu\">\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "              <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </li> -->\r\n"
				+ "          <li class=\"nav-item dropdown\">\r\n"
				+ "            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "              Dropdown\r\n"
				+ "            </a>\r\n"
				+ "            <ul class=\"dropdown-menu\">\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "              <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </li>\r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link disabled\">Disabled</a>\r\n"
				+ "          </li>\r\n"
				+ "        </ul>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "\r\n"
				+ "          <li><a class=\"btn btn-outline-success\" href=\"/Food/sigup.html\" role=\"button\">signup</a></li>\r\n"
				+ "          <li></li><a class=\"btn btn-warning\" href=\"/Food/login.html\" role=\"button\">Login</a></li>\r\n"
				+ "        </form>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </nav>\r\n"
				+ "\r\n"
				+ "  <div id=\"carouselExampleCaptions\" class=\"carousel slide carousel-fade\" data-bs-ride=\"carousel\">\r\n"
				+ "\r\n"
				+ "    <div class=\"carousel-indicators\">\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"\r\n"
				+ "        aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"\r\n"
				+ "        aria-label=\"Slide 2\"></button>\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"\r\n"
				+ "        aria-label=\"Slide 3\"></button>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"carousel-inner\">\r\n"
				+ "      <div class=\"carousel-item active\">\r\n"
				+ "        <img src=\"4.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book Now</a>\r\n"
				+ "            </div>\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"carousel-item\">\r\n"
				+ "        <img src=\"5.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book now</a>\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"carousel-item\">\r\n"
				+ "        <img src=\"6.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book now</a>\r\n"
				+ "            </div>\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n"
				+ "      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n"
				+ "      <span class=\"visually-hidden\">Previous</span>\r\n"
				+ "    </button>\r\n"
				+ "    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n"
				+ "      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n"
				+ "      <span class=\"visually-hidden\">Next</span>\r\n"
				+ "    </button>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "  <div class=\"card\">\r\n"
				+ "    <div class=\"card-header bg-info text-dark\">\r\n"
				+ "      Quote\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"card-body text-danger  border border-warning \">\r\n"
				+ "      <blockquote class=\"blockquote mb-0\">\r\n"
				+ "        <p>A well-known quote, contained in a blockquote element.</p>\r\n"
				+ "        <footer class=\"blockquote-footer text-primary\">Someone famous in <cite title=\"Source Title\">Source Title</cite>\r\n"
				+ "        </footer>\r\n"
				+ "      </blockquote>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <div class=\"row row-cols-1 row-cols-md-3 g-4 \">\r\n"
				+ "    <div class=\"col  \">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"img/3.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional\r\n"
				+ "            content. This content is a little bit longer.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"col\">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"1.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"col\">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"2.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional\r\n"
				+ "            content. This card has even longer content than the first to show that equal height action.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  <!--------------------------------------Order-Now-------------------------------------------->\r\n"
				+ "  <div class=\"container col-xxl-8 px-4 py-5\" id=\"order\">\r\n"
				+ "    <div class=\"row flex-lg-row-reverse align-items-center g-5 py-5\">\r\n"
				+ "      <div class=\"col-10 col-sm-8 col-lg-6\" data-aos=\"fade-out-down\">\r\n"
				+ "        <img src=\"theme1.jpg\" class=\"d-block mx-lg-auto img-fluid\" alt=\"Bootstrap Themes\" width=\"800\" height=\"800\"\r\n"
				+ "          loading=\"lazy\">\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"col-lg-6\" data-aos=\"fade-out-up\">\r\n"
				+ "        <h1 class=\"display-5 fw-bold lh-1 mb-3\">Book your<b style=\"color:rgb(245, 0, 0) ;\"><i>\"appointment\r\n"
				+ "              \"</i></b>Now...</h1>\r\n"
				+ "        <p class=\"lead\">Hey Guys, Get your <i>Online appointment</i> Favorites barbor right to your doorstep with\r\n"
				+ "          <i>Online\r\n"
				+ "            Foods</i>. we are here to provide you Halal and fresh food.\r\n"
				+ "          We use only the best ingredients to cook delicious meals for you. In our menu you will find a wide variety of\r\n"
				+ "          dishes, deserts and drinks. Why are you waiting, order now.</p>\r\n"
				+ "        <!-- <div class=\"d-grid gap-2 d-md-flex justify-content-md-start\">\r\n"
				+ "        <a href=\"orders.html\"> <button type=\"button\" class=\"btn btn-danger btn-lg px-4 me-md-4\">Order Now</button>\r\n"
				+ "        </a>\r\n"
				+ "      </div> -->\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <section class=\"py-5\" id=\"about\">\r\n"
				+ "    <div class=\"container-fluid\">\r\n"
				+ "      <div class=\"row\">\r\n"
				+ "        <div class=\"col-lg-5 col-6 mx-lg-0 mx-auto px-lg-5 px-md-0 my-auto\" data-aos=\"fade-in-down\"\r\n"
				+ "          data-aos-delay=\"300\">\r\n"
				+ "          <img class=\"w-100 border-radius-lg shadow\" src=\"themes2.jpg\" style=\"width: 600px;height: 400px; ;\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-lg-4 col-10 d-flex justify-content-center flex-column mx-auto text-lg-start text-center\"\r\n"
				+ "          data-aos=\"fade-out-down\" data-aos-delay=\"200\">\r\n"
				+ "          <h2 class=\"mb-0 mt-lg-0 mt-4 text-gradient text-danger\">Read more about us</h2>\r\n"
				+ "          <h2 class=\"mb-4\">And find some great partners</h2>\r\n"
				+ "          <p class=\"lead\">It really matters and then like it really doesn’t matter. What matters is the people who are\r\n"
				+ "            sparked by it. And the people who are like offended by it, it doesn’t matter. </p>\r\n"
				+ "          <ul class=\"m-lg-2 m-auto\" data-aos=\"fade-in-down\" data-aos-delay=\"300\">\r\n"
				+ "            <li class=\"lead mb-2\">People are so scared to lose their hope</li>\r\n"
				+ "            <li class=\"lead mb-2\">That’s the main thing people </li>\r\n"
				+ "            <li class=\"lead mb-2\">Thoughts- their perception of themselves!</li>\r\n"
				+ "          </ul>\r\n"
				+ "          <p class=\"blockquote my-3 ps-2\" data-aos=\"fade-in-down\" data-aos-delay=\"300\">\r\n"
				+ "            <span class=\"text-bold\">“Lorem itur at isibusdam, ratione minus doloremque!.”</span>\r\n"
				+ "            <br>\r\n"
				+ "            <small class=\"blockquote-footer\" data-aos=\"fade-in-bottom\" data-aos-delay=\"100\">\r\n"
				+ "              Ashok kumar\r\n"
				+ "            </small>\r\n"
				+ "          </p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </section>\r\n"
				+ "\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\"\r\n"
				+ "    integrity=\"sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js\"\r\n"
				+ "    integrity=\"sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "\r\n"
				+ "  <!--AOS-->\r\n"
				+ "  <script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\r\n"
				+ "  <script>\r\n"
				+ "    AOS.init();\r\n"
				+ "  </script>\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "    integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
return s;
	}

	
	public static String getIndex(String name) {

		String s="<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <title>Bootstrap demo </title>\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "    integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "    \r\n"
				+ "    <div class=\"container-fluid\">\r\n"
				+ "      <a class=\"navbar-brand\" href=\"#\">Saloon</a>\r\n"
				+ "      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n"
				+ "        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "        <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "      </button>\r\n"
				+ "      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link active\" aria-current=\"page\" href=\"/\">Home</a>\r\n"
				+ "          </li>\r\n"
				+ "         \r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link\" href=\"/about.html\">About</a>\r\n"
				+ "          </li>\r\n"
				+ "          <!-- <li class=\"nav-item dropdown\">\r\n"
				+ "            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "              Dropdown\r\n"
				+ "            </a>\r\n"
				+ "            <ul class=\"dropdown-menu\">\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "              <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </li> -->\r\n"
				+ "          <li class=\"nav-item dropdown\">\r\n"
				+ "            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "              Dropdown\r\n"
				+ "            </a>\r\n"
				+ "            <ul class=\"dropdown-menu\">\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "              <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "              <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "          </li>\r\n"
				+ "          <li class=\"nav-item\">\r\n"
				+ "            <a class=\"nav-link disabled\">Disabled</a>\r\n"
				+ "          </li>\r\n"
				+ "        </ul>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "\r\n"
				+ "          <li><a class=\"btn btn-outline-success\" >Welcome "+name +"</a></li>\r\n"
				+ "          <li></li><a class=\"btn btn-warning\" href=\"/Food/logout\" role=\"button\">Log Out</a></li>\r\n"
				+ "        </form>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </nav>\r\n"
				+ "\r\n"
				+ "  <div id=\"carouselExampleCaptions\" class=\"carousel slide carousel-fade\" data-bs-ride=\"carousel\">\r\n"
				+ "\r\n"
				+ "    <div class=\"carousel-indicators\">\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"\r\n"
				+ "        aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"\r\n"
				+ "        aria-label=\"Slide 2\"></button>\r\n"
				+ "      <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"\r\n"
				+ "        aria-label=\"Slide 3\"></button>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"carousel-inner\">\r\n"
				+ "      <div class=\"carousel-item active\">\r\n"
				+ "        <img src=\"4.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book Now</a>\r\n"
				+ "            </div>\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"carousel-item\">\r\n"
				+ "        <img src=\"5.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book now</a>\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"carousel-item\">\r\n"
				+ "        <img src=\"6.jpg\" class=\"d-block w-100\" alt=\"...\" style=\"width: 300px; height: 300px;\">\r\n"
				+ "        <div class=\"carousel-caption d-none d-md-block\">\r\n"
				+ "          <!-- <h2>welcome to Saloon</h2>\r\n"
				+ "          <p>Some representative placeholder content for the first slide.</p> -->\r\n"
				+ "          <!-- <form class=\"d-flex\" role=\"search\">\r\n"
				+ "            <div class=\"d-grid gap-2 col-2 mx-auto\">\r\n"
				+ "              <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book now</a>\r\n"
				+ "            </div>\r\n"
				+ "          </form> -->\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n"
				+ "      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n"
				+ "      <span class=\"visually-hidden\">Previous</span>\r\n"
				+ "    </button>\r\n"
				+ "    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n"
				+ "      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n"
				+ "      <span class=\"visually-hidden\">Next</span>\r\n"
				+ "    </button>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "  <div class=\"card\">\r\n"
				+ "    <div class=\"card-header bg-info text-dark\">\r\n"
				+ "      Quote\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"card-body text-danger  border border-warning \">\r\n"
				+ "      <blockquote class=\"blockquote mb-0\">\r\n"
				+ "        <p>A well-known quote, contained in a blockquote element.</p>\r\n"
				+ "        <footer class=\"blockquote-footer text-primary\">Someone famous in <cite title=\"Source Title\">Source Title</cite>\r\n"
				+ "        </footer>\r\n"
				+ "      </blockquote>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <div class=\"row row-cols-1 row-cols-md-3 g-4 \">\r\n"
				+ "    <div class=\"col  \">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"img/3.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional\r\n"
				+ "            content. This content is a little bit longer.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"col\">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"1.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"col\">\r\n"
				+ "      <div class=\"card h-100 border border-warning\">\r\n"
				+ "        <img src=\"2.jpg\" class=\"card-img-top\" alt=\"...\" style=\"width: 432px;height: 400px;\">\r\n"
				+ "        <div class=\"card-body\">\r\n"
				+ "          <h5 class=\"card-title\">Card title</h5>\r\n"
				+ "          <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional\r\n"
				+ "            content. This card has even longer content than the first to show that equal height action.</p>\r\n"
				+ "        </div>\r\n"
				+ "        <form class=\"d-flex\" role=\"search\">\r\n"
				+ "          <div class=\"d-grid gap-2 col-2 mx-lg-0\">\r\n"
				+ "            <a class=\"btn btn-danger\" href=\"/order.html\" role=\"button\">Book</a>\r\n"
				+ "          </div>\r\n"
				+ "\r\n"
				+ "        </form>\r\n"
				+ "        <div class=\"card-footer border border-success\">\r\n"
				+ "          <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  <!--------------------------------------Order-Now-------------------------------------------->\r\n"
				+ "  <div class=\"container col-xxl-8 px-4 py-5\" id=\"order\">\r\n"
				+ "    <div class=\"row flex-lg-row-reverse align-items-center g-5 py-5\">\r\n"
				+ "      <div class=\"col-10 col-sm-8 col-lg-6\" data-aos=\"fade-out-down\">\r\n"
				+ "        <img src=\"theme1.jpg\" class=\"d-block mx-lg-auto img-fluid\" alt=\"Bootstrap Themes\" width=\"800\" height=\"800\"\r\n"
				+ "          loading=\"lazy\">\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"col-lg-6\" data-aos=\"fade-out-up\">\r\n"
				+ "        <h1 class=\"display-5 fw-bold lh-1 mb-3\">Book your<b style=\"color:rgb(245, 0, 0) ;\"><i>\"appointment\r\n"
				+ "              \"</i></b>Now...</h1>\r\n"
				+ "        <p class=\"lead\">Hey Guys, Get your <i>Online appointment</i> Favorites barbor right to your doorstep with\r\n"
				+ "          <i>Online\r\n"
				+ "            Foods</i>. we are here to provide you Halal and fresh food.\r\n"
				+ "          We use only the best ingredients to cook delicious meals for you. In our menu you will find a wide variety of\r\n"
				+ "          dishes, deserts and drinks. Why are you waiting, order now.</p>\r\n"
				+ "        <!-- <div class=\"d-grid gap-2 d-md-flex justify-content-md-start\">\r\n"
				+ "        <a href=\"orders.html\"> <button type=\"button\" class=\"btn btn-danger btn-lg px-4 me-md-4\">Order Now</button>\r\n"
				+ "        </a>\r\n"
				+ "      </div> -->\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  <section class=\"py-5\" id=\"about\">\r\n"
				+ "    <div class=\"container-fluid\">\r\n"
				+ "      <div class=\"row\">\r\n"
				+ "        <div class=\"col-lg-5 col-6 mx-lg-0 mx-auto px-lg-5 px-md-0 my-auto\" data-aos=\"fade-in-down\"\r\n"
				+ "          data-aos-delay=\"300\">\r\n"
				+ "          <img class=\"w-100 border-radius-lg shadow\" src=\"themes2.jpg\" style=\"width: 600px;height: 400px; ;\">\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"col-lg-4 col-10 d-flex justify-content-center flex-column mx-auto text-lg-start text-center\"\r\n"
				+ "          data-aos=\"fade-out-down\" data-aos-delay=\"200\">\r\n"
				+ "          <h2 class=\"mb-0 mt-lg-0 mt-4 text-gradient text-danger\">Read more about us</h2>\r\n"
				+ "          <h2 class=\"mb-4\">And find some great partners</h2>\r\n"
				+ "          <p class=\"lead\">It really matters and then like it really doesn’t matter. What matters is the people who are\r\n"
				+ "            sparked by it. And the people who are like offended by it, it doesn’t matter. </p>\r\n"
				+ "          <ul class=\"m-lg-2 m-auto\" data-aos=\"fade-in-down\" data-aos-delay=\"300\">\r\n"
				+ "            <li class=\"lead mb-2\">People are so scared to lose their hope</li>\r\n"
				+ "            <li class=\"lead mb-2\">That’s the main thing people </li>\r\n"
				+ "            <li class=\"lead mb-2\">Thoughts- their perception of themselves!</li>\r\n"
				+ "          </ul>\r\n"
				+ "          <p class=\"blockquote my-3 ps-2\" data-aos=\"fade-in-down\" data-aos-delay=\"300\">\r\n"
				+ "            <span class=\"text-bold\">“Lorem itur at isibusdam, ratione minus doloremque!.”</span>\r\n"
				+ "            <br>\r\n"
				+ "            <small class=\"blockquote-footer\" data-aos=\"fade-in-bottom\" data-aos-delay=\"100\">\r\n"
				+ "              Ashok kumar\r\n"
				+ "            </small>\r\n"
				+ "          </p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </section>\r\n"
				+ "\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\"\r\n"
				+ "    integrity=\"sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js\"\r\n"
				+ "    integrity=\"sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "\r\n"
				+ "  <!--AOS-->\r\n"
				+ "  <script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\r\n"
				+ "  <script>\r\n"
				+ "    AOS.init();\r\n"
				+ "  </script>\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "    integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
return s;
	}

	
	
	
			
			

}