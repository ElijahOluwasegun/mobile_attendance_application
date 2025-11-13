package com.example.mobile_attendance_application

// Data class to hold the module title and the year/semester it belongs to
data class Module(val title: String)

// Static object to store the course structure
object ModuleData {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Introduction to Information and Communication Technologies"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Fundamentals of Information Systems"),
            Module("Discrete Mathematics"),
            Module("Basic Statistics")
        ),
        "Year 1, Semester 2" to listOf(
            Module("Internet Technology & Web Design"),
            Module("Computer Applications"),
            Module("Database Development and Management 1"),
            Module("Principles of programming"),
            Module("Information Systems Management"),
            Module("E-Commerce")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Systems Analysis and Design"),
            Module("Object oriented programming"),
            Module("Database Development and Management 1"),
            Module("Entrepreneurship & Small Business Management"),
            Module("Web Development and Management"),
            Module("Computer Networks & Data Communications")
        ),
        "Year 2, Semester 2" to listOf(
            Module("Operating Systems Principles"),
            Module("Software Engineering Principles"),
            Module("Emerging Trends in Information Technology"),
            Module("Computer Repair and Maintenance"),
            Module("Research Methodology in Computing"),
        ),
        "Year 3, Semester 1" to listOf(
            Module("ICT Project Planning and Management"),
            Module("Business Systems Modelling"),
            Module("Multimedia systems"),
            Module("Mobile Application Development"),
            Module("Network Configuration and Management")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Professional Issues in Computing"),
            Module("Information Systems Audit"),
            Module("Distributed System Development"),
            Module("Network and Information Security"),
            Module("User Interface Design")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}


object ModuleDataBBA {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Introduction to Information and Communication Technologies"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Financial Accounting"),
            Module("Business Administration"),
            Module("Microeconomics")
        ),
        "Year 1, Semester 2" to listOf(
            Module("Macroeconomics"),
            Module("Quantitative Methods for Business"),
            Module("Principles of Procurement & Logistics Management"),
            Module("Principles of Management"),
            Module("Business Law"),
            Module("Principles of Marketing")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Operations Management"),
            Module("Organisational Behavior"),
            Module("Managerial Accounting"),
            Module("Entrepreneurship & Small Business Management"),
            Module("Auditing 1"),
            Module("Human Resource Management")
        ),
        "Year 2, Semester 2" to listOf(
            Module("Strategic Management"),
            Module("Financial Management"),
            Module("Business Ethics"),
            Module("Taxation 1"),
            Module("Research Methodology"),
        ),
        "Year 3, Semester 1" to listOf(
            Module("Taxation 2"),
            Module("Public Finanace"),
            Module("Computerized Accounting 1"),
            Module("Advanced Accounting 1"),
            Module("Company Law"),
            Module("Public Sector Accounting")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Computerized Accounting 2"),
            Module("Treasury Management"),
            Module("Advanced Accounting 2"),
            Module("Investment Analysis"),
            Module("Auditing 2")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataLLB {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("LLB111:Introducing Law"),
            Module("LLB113:Criminal Law 1"),
            Module("LLB112:Constitutional History"),
            Module("LLB115:Law & Development"),
            Module("LLB114:Law of Contract 1")
        ),

        "Year 1, Semester 2" to listOf(
            Module("LLB121:Legal Methods"),
            Module("LLB123:Criminal Law 2"),
            Module("LLB124:Law of Contract 2"),
            Module("LLB125:Nature & History of Torts"),
            Module("LLB121:Legal Methods"),
            Module("LLB122:Constitutional Law ")
        ),
        "Year 2, Semester 1" to listOf(
            Module("LLB213:Evidence Law 1"),
            Module("LLB212:Land Law 1"),
            Module("LLB211:Family Law 1"),
            Module("LLB215:Equity and Trusts"),
            Module("LLB214:Negligence & Strict Liability")
        ),

        "Year 2, Semester 2" to listOf(
            Module("LLB221:Family Law 2"),
            Module("LLB223:Evidence Law 2"),
            Module("LLB224:Administrative Law"),
            Module("LLB222:Land Law II"),
            Module("LLB225:Social Research")
        ),
        "Year 3, Semester 1" to listOf(
            Module("LLB311:Criminal Procedure"),
            Module("LLB315:Law of Banking"),
            Module("LLB312:Business Associations 1"),
            Module("LLB314:Sale of Goods"),
            Module("LLB313:Jurisprudence 1")
        ),
        "Year 3, Semester 2" to listOf(
            Module("LLB323:Business Associations 2"),
            Module("LLB322:Jurisprudence 2"),
            Module("LLB327:Insurance Law"),
            Module("LLB325:Computers and the Law"),
            Module("LLB324:Alternative Dispute Resolution")
        ),
        "Year 4, Semester 1" to listOf(
            Module("LLB412:Revenue and Taxation Law 1"),
            Module("LLB416:Intellectual Property Law 1"),
            Module("LLB411:Civil Procedure 1"),
            Module("LLB413:International Law 1"),
            Module("LLB414:Labour Law")
        ),
        "Year 4, Semester 2" to listOf(
            Module("LLB426:Intellectual Property Law 2"),
            Module("LLB424:International Law 2"),
            Module("LLB421:Civil Procedure 2"),
            Module("LLB422:Revenue Law and Taxation 2")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBSE {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Introduction to Information and Communication Technologies"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Computer Architecture and Organisation"),
            Module("Discrete Mathematics"),
            Module("Calculus for software engineering")
        ),
        "Year 1, Semester 2" to listOf(
            Module("System Analysis and Design"),
            Module("Internet and Web Programming"),
            Module("Fundamentals of Database Systems"),
            Module("Principles of programming"),
            Module("Numerical Analysis and Computation")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Operating Systems Principles"),
            Module("Object oriented programming"),
            Module("Principles of Software Engineering"),
            Module("Advanced Database Systems"),
            Module("Data Structures and Algorithms"),
            Module("Computer Networks & Data Communications")
        ),
        "Year 2, Semester 2" to listOf(
            Module("Advanced Object Oriented Programming"),
            Module("Python Programming"),
            Module("Software Requirements Engineering"),
            Module("Advanced Internet and Web Programming"),
            Module("Formal Methods in Software Engineering"),
            Module("Research Methodology in Computing")
        ),
        "Year 3, Semester 1" to listOf(
            Module("Artificial Intelligence and Expert Systems"),
            Module("Internet of Things"),
            Module("Compiler Design"),
            Module("E-Commerce"),
            Module("Mobile Application Development"),
            Module("Network Configuration and Management")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Simulation & Modelling"),
            Module("Machine Learning "),
            Module("Software Evolution"),
            Module("Advanced Mobile Applications Development"),
            Module("User Interface Design")
        ),
        "Year 4, Semester 1" to listOf(
            Module("Software Metrics"),
            Module("Entrepreneurship & Small Business Management"),
            Module("Software Quality Assurance and Testing"),
            Module("Computer Games Development"),
            Module("Software Architecture & Patterns"),
            Module("Embedded Systems Development")
        ),
        "Year 4, Semester 2" to listOf(
            Module("Managing Software Engineering Projects"),
            Module("Software Engineering Ethics"),
            Module("Network Application Development"),
            Module("Software Security")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBCS {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Discrete Mathematics"),
            Module("Basic Statistics"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Computer Architecture and Organisation"),
            Module("Introduction to Information and Communication Technologies"),
            Module("Mathematics for Computing")
        ),

        "Year 1, Semester 2" to listOf(
            Module("Systems Analysis and Design "),
            Module("Internet and  Web Programming I"),
            Module("Principles of  Programming"),
            Module("E-Commerce"),
            Module("Numerical Analysis and Computation")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Simulation & Modeling "),
            Module("Object Oriented Programming"),
            Module("Database Development and Management 1 "),
            Module("Internet and  Web Programming II"),
            Module("Data Structures and Algorithms"),
            Module("Computer Networks and Data Communications")
        ),

        "Year 2, Semester 2" to listOf(
            Module("Operating Systems Principles"),
            Module("Software Engineering Principles"),
            Module("Database Development and Management II "),
            Module("Python Programming"),
            Module("Research Methodology in Computing"),
            Module("Business Systems Modeling "),
            Module("Embedded Systems Design")
        ),
        "Year 3, Semester 1" to listOf(
            Module("Artificial Intelligence and Expert Systems"),
            Module("ICT Project Planning and Management"),
            Module("Computer graphics"),
            Module("Compiler Design"),
            Module("Mobile Application Development"),
            Module("Network Configuration and Management")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Professional issues in Computing"),
            Module("Machine Learning "),
            Module("Entrepreneurship & Small Business Management "),
            Module("Emerging Trends in Computer Science "),
            Module("Network and Information Security ")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBDSA {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Digital Electronics"),
            Module("Discrete Mathematics"),
            Module("Basic Statistics"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Python Engineering"),
            Module("Calculus for software engineering"),
            Module("Introduction to Information and Communication Technologies")
        ),

        "Year 1, Semester 2" to listOf(
            Module("R Programming"),
            Module("Design Thinking "),
            Module("Numerical Analysis and Computation"),
            Module("Computer Networks and Data Communications"),
            Module("Internet and Web Programming"),
            Module("Object Oriented Programming")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Operating Systems"),
            Module("Data Wrangling "),
            Module("Data Ethics"),
            Module("Data Development and Management"),
            Module("Internet of Things"),
            Module("Data Structures and Algorithms"),
            Module("ASP.NET & C#")
        )        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBJCS {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Introduction to Behavioral Science"),
            Module("Introduction to Journalism & Media organisation"),
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Introduction to Information and Communication Technologies"),
            Module("History of the Media and Communication"),
            Module("Basic Academic Writing Skills")
        ),

        "Year 1, Semester 2" to listOf(
            Module("Mass Media and Society"),
            Module("Introduction to Political Science and Classical Thought "),
            Module("Introduction to Broadcasting"),
            Module("Introduction to Public Relations"),
            Module("Introduction to Media  writing"),
            Module("Computer Applications for Media")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Photojournalism"),
            Module("News Writing & Reporting"),
            Module("Development Communication"),
            Module("Media and Communication Policy"),
            Module("Media and Communication Theories"),
            Module("Audience Analysis and Media Research")
        ),

        "Year 2, Semester 2" to listOf(
            Module("Media Law & Ethics"),
            Module("Media Management"),
            Module("Advanced Writing"),
            Module("Principles of Advertising"),
            Module("Commercial Photography"),
            Module("Research Methodology")
        ),
        "Year 3, Semester 1" to listOf(
            Module("Investigative Journalism"),
            Module("Politics of Developments "),
            Module("Radio Production"),
            Module("The Art of Public Speaking"),
            Module("Multimedia and Animation"),
            Module("Public Relations & Media Practice"),
            Module("PR strategies, Planning and Programming"),
            Module("Politics of Communication and Propaganda"),
            Module("Politics of Developments"),
            Module("Radio Production")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Environmental Journalism"),
            Module("Television Production"),
            Module("Online and Digital Journalism"),
            Module("Newspaper and Magazine design"),
            Module("Fake news and media production"),
            Module("Media, Human rights and Gender"),
            Module("Digital Content for Brand Communications"),
            Module("Media and Conflict Management"),
            Module("International Public Relations and Diplomacy"),
            Module("Public Relation Consultancy and Media Monitoring "),
            Module("Media, Identity and Representation")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBPH {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Principles of Environmental Health"),
            Module("Introduction to Public Health and Ethics"),
            Module("Human Biology"),
            Module("Health and Health Behavior"),
            Module("Introduction to Information and Communication Technologies")
        ),

        "Year 1, Semester 2" to listOf(
            Module("Public Health Microbiology and disease surveillance"),
            Module("First Aid and emergency Rescue"),
            Module("Biostatistics"),
            Module("Principles of Epidemiology "),
            Module("Diseases of Public Health Importance ")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Principles of Disease Control"),
            Module("Health Informatics"),
            Module("Principles of Health Promotion"),
            Module("Principles of Demography and Population Dynamics"),
            Module("Public Health Nutrition =")
        ),

        "Year 2, Semester 2" to listOf(
            Module("Occupational Health and Safety"),
            Module("Public Health in Emergency Situations"),
            Module("Principles of Health Education and Advocacy"),
            Module("Health Policies and Laws"),
            Module("Research Methodology"),
        ),
        "Year 3, Semester 1" to listOf(
            Module("Social Marketing for Health"),
            Module("Community Health Practice"),
            Module("Health Monitoring and Evaluation"),
            Module("Family and Reproductive Health")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Institutional Health Management"),
            Module("Project Planning and Management"),
            Module("Health Economics and Financing"),
            Module("Health Service Management ")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBIRDS {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Protocol and Etiquette"),
            Module("Introduction to Information and Communication Technologies"),
            Module("Basic Academic Writing Skills"),
            Module("Introduction to Diplomacy"),
            Module("Introduction to International Relations")
        ),

        "Year 1, Semester 2" to listOf(
            Module("Terrorism and Related Global Issues"),
            Module("Introduction to Political Science"),
            Module("International Law"),
            Module("International Political Economy"),
            Module("The United Nations Systems"),
            Module("Government and Politics in Africa")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Regional Integration and Globalization"),
            Module("International Investment, Trade and Business Management"),
            Module("Religion, Conflict and Peace Studies"),
            Module("Public Administration and Management"),
            Module("Gender and International Relations"),
            Module("Africa and International Relations")
        ),

        "Year 2, Semester 2" to listOf(
            Module("International Politics of the Environment"),
            Module("Foreign Policy Analysis"),
            Module("Conflict Resolution, Management   and Transformation"),
            Module("Research Methods in International Relations"),
            Module("Comparative Political Systems"),
            Module("Advanced Theory of Diplomacy")
        ),
        "Year 3, Semester 1" to listOf(
            Module("International Politics, Media and Conflict"),
            Module("International Justice Mechanisms and International Criminal Justice"),
            Module("Global Geopolitical Analysis"),
            Module("Displaced Person and Forced Migration studies"),
            Module("Security Studies"),
            Module("International Development")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Ethics in International Relations"),
            Module("International Public Relations and   Strategic Communication"),
            Module("Strategic Intelligence, Modern Warfare and Human Rights"),
            Module("Civil Military Relations"),
            Module("Cyber Security and International Security"),
            Module("Africa and Contemporary International Security")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

object ModuleDataBPAM {
    val moduleMap = mapOf(
        "Year 1, Semester 1" to listOf(
            Module("Communication Skills and Learning Skills for Employability"),
            Module("Introduction to Information and Communication Technologies"),
            Module("Basic Academic Writing Skills"),
            Module("Theory and Management of Organisations"),
            Module("Public Finance Administration and Management"),
            Module("Public Administration and Management")
        ),

        "Year 1, Semester 2" to listOf(
            Module("Organizational Psychology"),
            Module("Introduction to Political Science"),
            Module("Political Economy"),
            Module("Governance and Public Sector Management"),
            Module("Decentralization and Local Government Administration"),
            Module("Economics for Public Administration and management")
        ),
        "Year 2, Semester 1" to listOf(
            Module("Environmental Management and Sustainable Development"),
            Module("Leadership and Change Management"),
            Module("Development Public Administration and Management"),
            Module("Human and Social Services Systems"),
            Module("Gender in Public Administration and Management"),
            Module("Regional Planning and Management")
        ),

        "Year 2, Semester 2" to listOf(
            Module("Demography and Population Studies"),
            Module("Introduction to Critical thinking"),
            Module("Resource Mobilization and Grants Administration"),
            Module("Government and Politics in Africa"),
            Module("Research Methodology"),
        ),
        "Year 3, Semester 1" to listOf(
            Module("Public Policy, Planning Analysis and Management"),
            Module("Constitutionalism and Administrative Law"),
            Module("Public and Private Procurement Management"),
            Module("Management of Public Enterprises"),
            Module("Human Resource Management"),
            Module("Civil Society Development and NGOs Management")
        ),
        "Year 3, Semester 2" to listOf(
            Module("Project Planning and Management"),
            Module("Human Rights and Social Justice"),
            Module("Ethics and Professionalism in Public Administration"),
            Module("Security Studies"),
            Module("Disaster Preparedness and Management")
        )
        // Add more years/semesters as needed
    )

    // List of all semester strings for the Spinner dropdown
    val semesterOptions = moduleMap.keys.toList()
}

