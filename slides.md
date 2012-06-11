# Using Maven with Scala Projects

...or "Introducing scala-maven-plugin<sup>[1]</sup>"

*[1] previously maven-scala-plugin*

---

# Why not SBT?

If you...

* want to introduce Scala into an **existing Maven project**,
* are learning Scala and **already know Maven**,
* need **something Maven provides** that SBT does not yet, or
* just **hate Ivy**.

---

# Features

* compile Scala source and test classes
* start REPL with project dependencies in classpath
* continuous compilation and testing
* generate scaladoc
* launch Scala classes
* execute scripts in files or embedded in POM

---

# Challanges

* Momentum favors SBT
* Incremental compilation support trails SBT
* Recent versions (3.0.0 and newer) require Maven 3.x

---

# Demos

* Minimum Working Configuration
* `scala:console` and jDBI for ad-hoc database querying
* Testing Java from Scala with maven-surefire-plugin and Specs2

---

# Other Things

* Eclipse/M2 plugin named **m2eclipse-scala**<br/>
  <https://github.com/sonatype/m2eclipse-scala><br/>
  Authors call it a "work in progress".
* `-DdisplayCmd=true` works for most goals<br/>
  Displays the command line being run for the goal.
* In `3.1.0-SNAPSHOT` there is integration with the SBT
  incremental compiler thanks to Peter Vlugter at Typesafe.<br/>
  Enable it with `-DrecompileMode=true` or in the POM.

---

# Meta

* License: public domain via UNLICENSE (<http://unlicense.org/>)
* Documentation is reasonably good.
* Mailing list is available and active in spurts.
* Commits also happen in spurts: 
  https://github.com/davidB/scala-maven-plugin/graphs/commit-activity

---

# Resources

* Code: <https://github.com/davidB/scala-maven-plugin>
* Docs: <http://davidb.github.com/scala-maven-plugin/>
* Mailing List: <http://groups.google.com/group/maven-and-scala>

---

# Me

Brad Fritz

*brad@fewerhassles.com*

*bfritz* on **github**, **irc** (freenode) and **twitter**

