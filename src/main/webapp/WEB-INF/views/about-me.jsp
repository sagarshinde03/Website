<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>About Me</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1 maximum-scale=1.0, user-scalable=no" />
    <link href="<c:url value="/resources/css/aboutme.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.scrollzer.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.scrolly.min.js" />"></script>
    <script src="<c:url value="/resources/js/skel.min.js" />"></script>
    <script src="<c:url value="/resources/js/util.js" />"></script>
    <script src="<c:url value="/resources/js/aboutme.js" />"></script>
</head>
<body>
	<section id="header" style="overflow: auto;">
		<header>
			<span class="image avatar"><img src="<c:url value="/resources/images/profile_pic.jpg" />" alt="" /></span>
			<span id="logo" style="font-size: 150%"><a>Sagar Bansilal Shinde</a></span>
			<p>Master of Science in Computer Science, State University of New York at Buffalo</p>
		</header>
		<nav id="nav">
			<ul>
				<li><a href="#one" class="active">Education</a></li>
				<li><a href="#two">Work-Experience</a></li>
				<li><a href="#three">Honors/Prizes</a></li>
				<li><a href="#four">Computer Skills</a></li>
				<li><a href="#five">Independent Projects</a></li>
				<li><a href="#six">Academic Projects</a></li>
				<li><a href="#seven">Test Scores</a></li>
                <li><a href="#eight">Hobbies</a></li>
			</ul>
		</nav>
		<ul class="icons">
		    <li>Contact me</li>
            <br>
            <li><a href="https://www.facebook.com/sagar.shinde.73744" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
            <li><a href="https://www.linkedin.com/in/sagarshinde1" class="icon fa-linkedin"><span class="label">Linkedin</span></a></li>
			<li><a href="https://twitter.com/sagarshinde03" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
			<li><a href="https://github.com/sagarshinde03" class="icon fa-github"><span class="label">Github</span></a></li>
		</ul>
	</section>
	<div id="wrapper">
		<!-- Wrapper -->
		<div id="main">
			<section id="one">
				<div class="container" align="justify">
					<header class="major">
						<h2>Education</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<h3>State University of New York at Buffalo</h3>
								<p >Master of Science in Computer Science</p>
								<p align="right">Aug 2014-Dec 2015</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>University of Mumbai</h3>
								<p>Bachelor of Engineering in Electronics and Telecommunication</p>
								<p align="right">Aug 2007-June 2011</p>
							</div>
						</article>
					</div>
				</div>
			</section>

			<section id="two">
				<div class="container" align="justify">
					<header class="major">
						<h2>Work-Experience</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<h3>Tata Consultancy Services, Mumbai, India</h3>
								<p align="right">Sep 2011 - Jul 2014</p>
								<p>Developed deposit and loan modules of TCS BaNCS, a software product for banks. Functionalities under deposit
module enabled the system to deposit and withdraw money from banking account of the customer and functionalities under loan
module helped bank managers decide loan amount to be granted based on background of the customer.</p>
								<p>Developed web based application for an insurance company. The application stores health record and financial capacity of customers and evaluates eligibility for issuance of insurance.</p>
								<p>Developed stored procedures in both SQL and Oracle databases for different clients to reduce the time taken to fetch
the results from the database by 10-15% which enabled tellers to fetch data quickly.</p>
								<p><font style="font-weight: bold;">Achievements at workplace</font>
								<br>Awarded 'TCS Gem', an appreciation token by TCS (Tata Consultancy Services), Apr 2013.
								<br>Awarded 'On the Spot Award' for learning technologies quickly and improving coding skills, Apr 2013.
								<br>Awarded 'Certificate of Recognition' for contribution towards TCS BaNCS implementation, Jan 2014.
								</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>Wayfair, Boston, USA</h3>
								<p align="right">Apr 2016 - Present</p>
								<p>Developed Pixel Management System for advertisement of recently seen items on Wayfair's website by a customer.</p>
								<p>Built the functionality for browsing rugs using visual search backend. User could enter the URL of the image 
								and similar rugs result is shown to him and implemented filter functionality for rugs browsing.</p>
								<p><font style="font-weight: bold;">Achievements at workplace</font>
								<br>Recognized as 'Solution Superstar' for building Pixel Management System, Aug 2016.
								</p>
							</div>
						</article>
					</div>
				</div>
			</section>
			
			<section id="three">
				<div class="container" align="justify">
					<header class="major">
						<h2>Honors/Prizes</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<p>2nd prize out of around 200 candidates in Microsoft Code-con coding competition held at University at Buffalo, Oct 2015.
								<br>4th rank out of 101 candidates in Bloomberg Coding Competition held at University at Buffalo, Nov 2015.</p>
							</div>
						</article>
					</div>
				</div>
			</section>
			
			<section id="four">
				<div class="container" align="justify">
					<header class="major">
						<h2>Computer Skills</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<p><font style="font-weight: bold;">Programming Languages: </font>Java, Javascript
								<br><font style="font-weight: bold;">Databases: </font>MS SQL Server, MySQL, Oracle
								<br><font style="font-weight: bold;">Web Technologies: </font>HTML, CSS, JSON, REST, XSLT
								<br><font style="font-weight: bold;">Frameworks: </font>Spring, Hibernate, JDBC, J2EE
								<br><font style="font-weight: bold;">Other Technologies: </font>AWS, Hadoop, Tomcat, JUnit</p>
							</div>
						</article>
					</div>
				</div>
			</section>
			
			<section id="five">
				<div class="container" align="justify">
					<header class="major">
						<h2>Independent Projects</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<p>Developed Infrastructure as a Service 
								(<a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Infrastructure_as_a_service">IaaS</a>) 
								based web application using <a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Spring_Framework">Spring</a>, 
								<a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Hibernate_(framework)">Hibernate</a> and 
								<a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Apache_Tomcat">Tomcat</a> and hosted the application on 
								<a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Amazon_Web_Services">AWS</a>.
								<br>A user has to create an account on the website and he/she can then play games like Tic-Tac-Toe and check how many games were won/lost/tied.
								<br>Used <a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/Spring_Security">Spring Security</a> 
								for user's account authentication, authorization and other security features and <a style="font-weight: bold;" target="_blank" href="https://en.wikipedia.org/wiki/MySQL">MySQL</a> for database.
								<br>The application is available at <a target="_blank" href="http://sagarshinde.q3cqfmwecu.us-west-2.elasticbeanstalk.com">http://sagarshinde.q3cqfmwecu.us-west-2.elasticbeanstalk.com</a>
								<br>Github code is available at <a target="_blank" href="https://github.com/sagarshinde03/Website">https://github.com/sagarshinde03/Website</a>
								</p>
							</div>
						</article>
					</div>
				</div>
			</section>
			
			<section id="six">
				<div class="container" align="justify">
					<header class="major">
						<h2>Academic Projects</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<h3>Data Warehouse System</h3>
								<p>Implemented a data warehouse for clinical data using Oracle database system.
								</p><p>Created UI for accepting queries and displaying results dynamically and improved query retrieval efficiency.
								</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>Clustering Algorithms - Data Mining</h3>
								<p>Implemented Hierarchical Agglomerative Clustering and Density based clustering algorithms to find clusters of similar genes.
								</p><p>Compared the performances of these algorithms using PCA for visualization and Correlation.
								</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>FIFO Ordered Group Messenger with Dynamo-style Replicated Data Storage - Distributed Systems</h3>
								<p>Implemented ISI algorithm to develop messenger which sends text messages in a group of Android Virtual Devices (AVDs).
								</p><p>Developed consistent hashing, key-value storage and linearizability (using vector clocks) over five Android devices.
								</p><p>Maintained Total and FIFO order of messages and handled AVD failures using replicated data storage.
								</p><p>Implemented persistent key-value pair Table using Content Providers to store the messages.
								</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>Search Engine using Apache Solr</h3>
								<p>Parsed more than 40,000 Wikipedia documents using SAX parser written in Java.
								</p><p>Built a web application with Apache Solr as search platform and implemented Solr features such as prioritizing search and result categorization, faceted search, spatial search and similar pages using MoreLikeThis.
								</p>
							</div>
						</article>
						<article>
							<div class="inner">
								<h3>Listing of NASDAQ stocks by their volatility using Hadoop Mapreduce technology</h3>
								<p>Listed stocks by their volatility from given 36 months of monthly data for 30,000 stocks running the computations in parallel over a cluster of nodes using Mapreduce, Pig and Hive programming paradigm.
								</p><p>Evaluated scalability of implementation on different data sizes and different number of nodes.
								</p>
							</div>
						</article>
					</div>
				</div>
			</section>
			
			<section id="seven">
				<div class="container" align="justify">
					<header class="major">
						<h2>Test Scores</h2>
						<p></p>
					</header>
					<div class="features">
						<article>
							<div class="inner">
								<p>Scored 170/170 (better than 98% of all test writers) in GRE's Quantitative Ability Section, Oct 2013.</p>
								<p>Scored 98.11 percentile in Common Admission Test (CAT) of India, Jan 2014.</p>
							</div>
						</article>
					</div>
				</div>
			</section>

            <section id="eight">
                <div class="container" >
                    <header class="major">
                    <h2>Hobbies</h2></header>
                    
                    <ul class="feature-icons">
                        <li class="fa-star-o">Watching Tennis</li>
                        <li class="fa-star-o">Watching Soccer</li>
                        <li class="fa-star-o">Chatting with friends</li>
                    </ul>
                </div>
            </section>            
		</div>
		<!-- Footer -->
		<section id="footer">
			<div class="container">
				<ul class="copyright">
					<li>All rights reserved.</li><li>2016</li>
				</ul>
			</div>
		</section>
	</div>
</body>
</html>