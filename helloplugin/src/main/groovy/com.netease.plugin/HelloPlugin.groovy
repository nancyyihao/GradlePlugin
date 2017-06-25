package com.netease.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

public class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        println "hello, this is plugin!"

    }
}