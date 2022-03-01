package com.github.aleksandarilic.bugfreeoctocomputingmachine.services

import com.intellij.openapi.project.Project
import com.github.aleksandarilic.bugfreeoctocomputingmachine.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
