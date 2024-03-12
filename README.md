# Tech_Mavericks_KSP

## Objective:
Our primary goal is to develop a mobile application for
task allocation within law enforcement. This application
will leverage AI-based recommendations, informed by
expert police officer review, to optimize task
assignment based on officer expertise, experience, and
station capabilities, ultimately aiming to improve
efficiency and effectiveness.

## Android Studio:
Here we create our App through the Android Studio. Here we see how to use Android Studio and how to work on it.
In this guide, I am going to help you get started with Android application development using Android Studio. This tutorial is for beginners who have yet to create an Android applications. As such, I aim to teach you the very basics of the Android Studio platform. 

Below are the basic requirements you should have prior to getting started.

### Prerequisites 

1. The latest Java Development Kit(JDK). At the time of writing, JDK8 was the latest JDK. Install it [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

2. 2 GB RAM minimum, 8 GB RAM recommended. *We'll need RAM for running our Android Virtual Device (AVD) emulator and processing our code.*

3. The latest version of Android Studio. Get it from [here](https://developer.android.com/studio/index.html).


### Let's look at the basic Android App.

###  Install Android Studio

Follow the Android Studio installer instructions. Keep track of the location where the system puts the Android files. This makes accessing your files easier.

### Start your first Android application

-> Go to File -> New Project

-> Choose the "Empty Activity" from the available list of Activities displayed in the window. Think of an activity as a page of your application. Each activity comprises design and code. 

-> Give your activity a name (anything will do for now). The Android gradle will construct your application now. You should see something like this.


![Android Studio new activity](https://raw.githubusercontent.com/pluralsight/guides/master/images/fa23df0d-df65-47f0-9bed-3c61f257feb6.png)

-> You will see a corresponding .xml file generated automatically under the `res/layout` folder. By default, this layout folder will contain the XML files associated with any activities that you create. We'll use the XML layout file to create our User Interface (UI).

-> When the project loads, you will be presented with `activity_main.xml`, the default design page when the project is created, and with `activity.java`, which is the Java class that is associated with your activity and its design components. Let's look at the `activity_main.xml` file for now.

-> The `activity_main.xml` is the designer page for your Android application. To the left of the designer window, you will be presented with the palette from which you can drag and drop the controls. For example, you can see various __layouts__,like the standard RelativeLayout, __widgets__, such as Buttons, __text fields__ like TextViews,  and much more.

![description](https://raw.githubusercontent.com/pluralsight/guides/master/images/08106c25-2aae-4de5-899b-1e9e9b8ff9ca.png)


-> At the bottom of the designer window you will find two navigators, titled Design and Text. You can see them in the image above. Use these tabs to switch between the code-based XML (or Extensible Markup Language) editor and your drag-and-drop UI editor.
  
-> By default, you should have a designer with the Sample Text, "Hello World", displayed. Believe it or not, this is a fully-functional Android application. No code necessary! Let's test it out.

### Run your basic "Hello World" application

To run and see how the app works 

-> Go to the "Run" option. This looks like a green play button in the top Menu toolbar. Click "Run".


![description](https://raw.githubusercontent.com/pluralsight/guides/master/images/22639add-b356-4023-af96-0a1074399842.png)


-> You need to run your application on an Android device or an emulator. If you don't have an Android device available, create a new Emulator in the window that is presented. Check out [this step-by-step guide](https://www.embarcadero.com/starthere/xe5/mobdevsetup/android/en/creating_an_android_emulator.html) on building your emulator. *Be aware that the AVD requires Intel's HAXM software; in Windows, this may conflict with the pre-installed Hyper-V. You may need to disable Hyper-V to continue.*

-> Wait for the application to build. Once the build process is complete, you will have the emulator (or USB-connected Android device) running the application. The screen should show your app name at the top with "Hello World" as the dominant text.

I hope this will help you get started with Android app development using Android Studio. 

## Unique Feautures:

-> AI-driven Task Allocation

-> Mobile Application and Dashboard

-> Reward System for Motivation

-> Implementing Comprehensive Security Measures

-> Criminal Record Access

-> Data Acquisition

-> Streamlining Collaboration

-> Strategic AI-Generated Public Disclosure

-> Secure Chat Communication

-> Dashboard Design

-> Police station level

-> DySP/ACP level


### AI-driven Task Allocation:
Utilize AI to recommend task assignments based on officer
expertise, experience, and station capabilities, guided by expert police officer review.

### Mobile Application and Dashboard:
Provide a user-friendly mobile application and an
intuitive dashboard for officers and supervisors to access and manage tasks.

### Reward System for Motivation: 
Introduce an incentive system to acknowledge and
motivate officers for completing assigned tasks efficiently.

### Implementing Comprehensive Security Measures: 
Safeguarding sensitive police
information through SSL encryption, Hardware Secure Modules, and HTTPS for secure
interactions with the server, while maintaining role-specific data access for each user

### Criminal Record Access: 
Grant authorized officers access to detailed criminal records to
enhance case investigation and decision-making.

#### Data Acquisition: 
Develop mobile application for police officers. Integrate with existing
police IT systems (PoliceIT, IRAD).

### Streamlining Collaboration: 
Strengthening Collaboration: Enabling police to engage with
lawyers and prosecutors on case files, and facilitating direct evidence submission to
obtain arrest warrants from High Court judges.

### Strategic AI-Generated Public Disclosure: 
If a high-profile case requires public awareness,
Utilizing AI to craft concise, redacted articles for online and print publication, excluding sensitive
details. These articles can be strategically shared with news channels and newspapers.

### Secure Chat Communication: 
Provide a secure in-app chat functionality for communication
between officers and superiors regarding sensitive criminal information, ensuring that the data
remains within the chat until the case is officially closed.

### Dashboard Design: 
Display data at three levels: police station, inspector (PI), and DySP/ACP.

### Police station level: 
Show tables with active tasks list (including task type, assigned officer,
start/due date, and status) and officer roster (including name, rank, current tasks, and availability).
Use bar charts to compare task completion rates and visualize task distribution by type.

### PI level: 
Use maps to show the locations of police stations under the PI's supervision. Use bar
charts to compare performance metrics (e.g., completion rates, average response time) of stations
under a PI. Include trend lines to show progress or workload changes over time.

### DySP/ACP level:
Use summary tables to display total tasks, open vs. closed tasks, and manpower
metrics for the region. Optionally, use a map to show the locations of multiple PIs' jurisdictions,
with visual overlays to show regional trends.

