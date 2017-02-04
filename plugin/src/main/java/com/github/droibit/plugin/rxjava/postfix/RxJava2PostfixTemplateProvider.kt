package com.github.droibit.plugin.rxjava.postfix

import com.github.droibit.plugin.rxjava.postfix.templates.ObservableErrorTemplate
import com.github.droibit.plugin.rxjava.postfix.templates.ObservableFromIterableOrArrayTemplate
import com.github.droibit.plugin.rxjava.postfix.templates.ObservableJustTemplate
import com.github.droibit.plugin.rxjava.postfix.templates.SingleJustTemplate
import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider

class RxJava2PostfixTemplateProvider : JavaPostfixTemplateProvider() {

    private val templates = hashSetOf(
            ObservableFromIterableOrArrayTemplate(),
            ObservableJustTemplate(),
            ObservableErrorTemplate(),
            SingleJustTemplate()
    )

    override fun getTemplates() = templates
}