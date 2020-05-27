package com.andile.bookapi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andile.bookapi.entities.Book;
import com.andile.bookapi.entities.BookCategory;
import com.andile.bookapi.repositorry.BookCategoryRepository;
import com.andile.bookapi.repositorry.BookRepository;

@Service
public class DataFilerService {

	private final BookRepository bookRepository;
	private final BookCategoryRepository bookCategoryRepository;

	public DataFilerService(BookRepository bookRepository, BookCategoryRepository bookCategoryRepository) {
		this.bookCategoryRepository = bookCategoryRepository;
		this.bookRepository = bookRepository;
	}

	// bootstrap some data into the database
	@PostConstruct
	@Transactional
	public void fillData() {

		//
		BookCategory progromming1 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming2 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming3 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming4 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming5 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming6 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming7 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming8 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming9 = new BookCategory(1, "Programming", new ArrayList<Book>());
		BookCategory programming10 = new BookCategory(1, "Programming", new ArrayList<Book>());
		//
		BookCategory webdevelopment1 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment2 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment3 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment4 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment5 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment6 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment7 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment8 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment9 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		BookCategory webdevelopment10 = new BookCategory(2, "Webdevelopment", new ArrayList<Book>());
		//
		BookCategory db1 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db2 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db3 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db4 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db5 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db6 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db7 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db8 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db9 = new BookCategory(3, "Databases", new ArrayList<Book>());
		BookCategory db10 = new BookCategory(3, "Databases", new ArrayList<Book>());
		// administration
		BookCategory administration1 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration2 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration3 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration4 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration5 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration6 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration7 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration8 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration9 = new BookCategory(4, "Administration", new ArrayList<Book>());
		BookCategory administration10 = new BookCategory(4, "Administration", new ArrayList<Book>());

		bookCategoryRepository.save(progromming1);
		bookCategoryRepository.save(programming2);
		bookCategoryRepository.save(programming3);
		bookCategoryRepository.save(programming4);
		bookCategoryRepository.save(programming5);
		bookCategoryRepository.save(programming6);
		bookCategoryRepository.save(programming7);
		bookCategoryRepository.save(programming8);
		bookCategoryRepository.save(programming9);
		bookCategoryRepository.save(programming10);

		bookCategoryRepository.save(webdevelopment1);
		bookCategoryRepository.save(webdevelopment2);
		bookCategoryRepository.save(webdevelopment3);
		bookCategoryRepository.save(webdevelopment4);
		bookCategoryRepository.save(webdevelopment5);
		bookCategoryRepository.save(webdevelopment6);
		bookCategoryRepository.save(webdevelopment7);
		bookCategoryRepository.save(webdevelopment8);
		bookCategoryRepository.save(webdevelopment9);
		bookCategoryRepository.save(webdevelopment10);

		bookCategoryRepository.save(db1);
		bookCategoryRepository.save(db2);
		bookCategoryRepository.save(db3);
		bookCategoryRepository.save(db4);
		bookCategoryRepository.save(db5);
		bookCategoryRepository.save(db6);
		bookCategoryRepository.save(db7);
		bookCategoryRepository.save(db8);
		bookCategoryRepository.save(db9);
		bookCategoryRepository.save(db10);

		bookCategoryRepository.save(administration1);
		bookCategoryRepository.save(administration2);
		bookCategoryRepository.save(administration3);
		bookCategoryRepository.save(administration4);
		bookCategoryRepository.save(administration5);
		bookCategoryRepository.save(administration6);
		bookCategoryRepository.save(administration7);
		bookCategoryRepository.save(administration8);
		bookCategoryRepository.save(administration9);
		bookCategoryRepository.save(administration10);

		// programming books
		Book cShap = new Book((long) 1, "programming-100", "C#", "Learn C# Programming Language", 490,
				"/assets/images/programming/programming-100.jpg", true, 300, LocalDateTime.now(), null, progromming1);
		Book jakar = new Book((long) 2, "programming-101", "Introducing Jakarta EE CDI",
				"Contexts and Depedency Injection for Enterprise Java Development", 829,
				"/assets/images/programming/programming-101.jpg", true, 300, LocalDateTime.now(), null, programming2);
		Book python = new Book((long) 3, "programming-102", "Informatics with Python", "Exploring Informatics Python",
				240, "/assets/images/programming/programming-102.jpg", true, 300, LocalDateTime.now(), null,
				programming3);
		Book cpp = new Book((long) 4, "programming-103", "MATALAB", "A Project-Based Approach", 830,
				"/assets/images/programming/programming-103.jpg", true, 300, LocalDateTime.now(), null, programming4);
		Book apiJava = new Book((long) 5, "programming-104", "Advanced Robotic Vehicles", "A Project-Based Approach",
				630, "/assets/images/programming/programming-104.jpg", true, 300, LocalDateTime.now(), null,
				programming5);
		Book machineLearn = new Book((long) 6, "programming-105", "Exploring the .Net Core 3.0 Runtime",
				"Through Code Generation and Metadata", 416, "/assets/images/programming/programming-105.jpg", true,
				300, LocalDateTime.now(), null, programming6);

		Book cprog = new Book((long) 7, "programming-106", "Algorithms in C Programming",
				"A Step by Step guide to Algorithms", 695, "/assets/images/programming/programming-16.jpg", true, 300,
				LocalDateTime.now(), null, programming7);
		Book dataStru = new Book((long) 8, "programming-107", "Modern C", "Learn Modern C programming language", 560,
				"/assets/images/programming/programming-107.jpg", true, 300, LocalDateTime.now(), null, programming8);
		Book crushInterview = new Book((long) 9, "programming-108", "Raspberry PI", "Projects for kids", 600,
				"/assets/images/programming/programming-108.jpg", true, 300, LocalDateTime.now(), null, programming9);
		Book java = new Book((long) 10, "programming-100", "Enterprise Java Microservies", "Master Core Java basics",
				754, "/assets/images/programming/programming-109.jpg", true, 300, LocalDateTime.now(), null,
				programming10);

		// database books
		Book proS = new Book((long) 11, "databases-100", "JPro T-SQL 2019",
				"Toward Speed , Scalability and Standardization for SQL Server", 754,
				"/assets/images/databases/databases-100.jpg", true, 300, LocalDateTime.now(), null, db1);
		Book cloud = new Book((long) 12, "databases-101", "Oracle Cloud", "Pratical Oracle Cloud infrastructure", 829,
				"/assets/images/databases/databases-101.jpg", true, 300, LocalDateTime.now(), null, db2);
		Book python2 = new Book((long) 13, "databases-102", "Large Datasets with Python",
				"Mastering Datasets with Python Language", 240, "/assets/images/databases/databases-102.jpg", true, 300,
				LocalDateTime.now(), null, db3);
		Book sql = new Book((long) 14, "databases-103", "SQL Server", "SQL Server Big Data Clusters", 490,
				"/assets/images/databases/databases-103.jpg", true, 300, LocalDateTime.now(), null, db4);
		Book tSql = new Book((long) 15, "databases-104", "Refactoring Legacy T-SQL",
				"Improved Perfomance , Modern Practices", 830, "/assets/images/databases/databases-104.jpg", true, 300,
				LocalDateTime.now(), null, db5);
		Book dataScie = new Book((long) 16, "databases-105", "Data Science Programming",
				"Learn Data Science all in one", 560, "/assets/images/databases/databases-105.jpg", true, 300,
				LocalDateTime.now(), null, db6);
		Book mongoDb = new Book((long) 17, "databases-106", "MongoDB", "The Definitive Guide to MongoDB", 695,
				"/assets/images/databases/databases-106.jpg", true, 300, LocalDateTime.now(), null, db7);
		Book aws = new Book((long) 18, "databases-102", "AWS Application integration",
				"With Amazon SQS , SNS , SWF and Step fuction", 600, "/assets/images/databases/databases-107.jpg", true,
				300, LocalDateTime.now(), null, db8);
		Book snow = new Book((long) 19, "databases-102", "Jumpstart Snowflake",
				"A Step-by-Step guide to Modern Cloud Analytics", 690, "/assets/images/databases/databases-108.jpg",
				true, 300, LocalDateTime.now(), null, db9);
		Book reipes = new Book((long) 20, "databases-102", "MongoDB Recipes",
				"With Data Modeling and Query Building Strategies", 416, "/assets/images/databases/databases-109.jpg",
				true, 300, LocalDateTime.now(), null, db10);
		// administration books
		Book cpanel = new Book((long) 21, "administration-100", "CPanel", "User guide and tutorial", 754,
				"/assets/images/administration/administration-100.jpg", true, 300, LocalDateTime.now(), null,
				administration1);
		Book outlook = new Book((long) 22, "administration-101", "Outlook 2007 Programming",
				"An outlook in Programming Languages", 829, "/assets/images/administration/administration-101.jpg",
				true, 300, LocalDateTime.now(), null, administration2);
		Book proJava = new Book((long) 23, "administration-102", "Pro Java Clusterring ans Csalability",
				"Learn Python Language", 240, "/assets/images/administration/administration-102.jpg", true, 300,
				LocalDateTime.now(), null, administration3);
		Book modul = new Book((long) 24, "administration-103", "Modular Design Frameworks",
				"A Projects-based guide for UI/UX", 490, "/assets/images/administration/administration-103.jpg", true, 300,
				LocalDateTime.now(), null, administration4);
		Book appl = new Book((long) 25, "administration-104", "Applied OpenStack", "Applied open Stack Design Patterns",
				830, "/assets/images/administration/administration-104.jpg", true, 300, LocalDateTime.now(), null,
				administration5);
		Book vMware = new Book((long) 26, "administration-105", "VMware", "Design CPU, Memory , Storage and Networking",
				560, "/assets/images/administration/administration-105.jpg", true, 300, LocalDateTime.now(), null,
				administration6);
		Book vS = new Book((long) 27, "administration-106", "vSphere", "VMware vSphere for dummies", 695,
				"/assets/images/administration/administration-106.jpg", true, 300, LocalDateTime.now(), null,
				administration7);
		Book elastic = new Book((long) 28, "administration-107", "Elastic Stack",
				"Crushing course for beginning Elastic Stack", 600,
				"/assets/images/administration/administration-107.jpg", true, 300, LocalDateTime.now(), null,
				administration8);
		Book nginx = new Book((long) 29, "administration-108", "Nginx", "Learn Nginx from zero to hero", 416,
				"/assets/images/administration/administration-108.jpg", true, 300, LocalDateTime.now(), null,
				administration9);
		Book web = new Book((long) 30, "administration-109", "Web Audio API", "Java Framework Architect", 540,
				"/assets/images/administration/administration-109.jpg", true, 300, LocalDateTime.now(), null,
				administration10);
		// Web-development
		Book sas = new Book((long) 31, "webdevelopment-100", "Python for SAS Users",
				"A SAS-Oriented Introduction to Python", 123, "/assets/images/webdevelopment/webdevelopment-100.jpg",
				true, 300, LocalDateTime.now(), null, webdevelopment1);
		Book javaS = new Book((long) 32, "webdevelopment-101", "JavaScript", "Deep learning with JS", 527,
				"/assets/images/webdevelopment/webdevelopment-101.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment2);
		Book clean = new Book((long) 33, "webdevelopment-102", "Clean Ruby",
				"A guide to crafting better code for Rubyists", 340,
				"/assets/images/webdevelopment/webdevelopment-102.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment3);
		Book pyt = new Book((long) 34, "webdevelopment-103", "Python", "Practices of Python Programming Language", 560,
				"assets/images/webdevelopment/webdevelopment-103.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment4);
		Book flutter = new Book((long) 35, "webdevelopment-104", "Flutter", "Flutter in Action", 830,
				"/assets/images/webdevelopment/webdevelopment-104.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment5);
		Book rabbi = new Book((long) 36, "text-105", "RabbitMQ", "RabbitMQ in Depth", 560,
				"/assets/images/webdevelopment/webdevelopment-105.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment6);
		Book git = new Book((long) 37, "webdevelopment-106", "Git and GitHub",
				"A comprehesive guide to Version Control", 695, "/assets/images/webdevelopment/webdevelopment-106.jpg",
				true, 300, LocalDateTime.now(), null, webdevelopment7);
		Book django = new Book((long) 38, "webdevelopment-102", "Django", "Designing Microservices with Django", 600,
				"/assets/images/webdevelopment-/webdevelopment-107.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment8);
		Book pytho = new Book((long) 39, "webdevelopment-102", "Python Projects",
				"A ten-week learning of Python Language", 690, "/assets/images/webdevelopment-/webdevelopment-108.jpg",
				true, 300, LocalDateTime.now(), null, webdevelopment9);
		Book pro = new Book((long) 40, "webdevelopment-102", "Pro D3.js",
				"Use D3.js to create maintainable , modular and testable charts", 416,
				"/assets/images/webdevelopment-/webdevelopment-109.jpg", true, 300, LocalDateTime.now(), null,
				webdevelopment10);
		// programming
		bookRepository.save(java);
		bookRepository.save(jakar);
		bookRepository.save(python);
		bookRepository.save(cpp);
		bookRepository.save(cprog);
		bookRepository.save(crushInterview);
		bookRepository.save(cShap);
		bookRepository.save(dataStru);
		bookRepository.save(machineLearn);
		bookRepository.save(apiJava);
		// webdevelopment
		bookRepository.save(sas);
		bookRepository.save(javaS);
		bookRepository.save(clean);
		bookRepository.save(pyt);
		bookRepository.save(flutter);
		bookRepository.save(rabbi);
		bookRepository.save(git);
		bookRepository.save(django);
		bookRepository.save(pytho);
		bookRepository.save(pro);

		// database
		bookRepository.save(proS);
		bookRepository.save(cloud);
		bookRepository.save(python2);
		bookRepository.save(sql);
		bookRepository.save(tSql);
		bookRepository.save(dataScie);
		bookRepository.save(mongoDb);
		bookRepository.save(aws);
		bookRepository.save(snow);
		bookRepository.save(reipes);
		// admin
		bookRepository.save(cpanel);
		bookRepository.save(outlook);
		bookRepository.save(proJava);
		bookRepository.save(modul);
		bookRepository.save(appl);
		bookRepository.save(vMware);
		bookRepository.save(vS);
		bookRepository.save(elastic);
		bookRepository.save(nginx);
		bookRepository.save(web);

	}
}
