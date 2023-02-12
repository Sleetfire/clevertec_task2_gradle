import org.gradle.api.Project
import org.gradle.api.Plugin

class TestCopyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.register("copy-test") {
            onlyIf {
                project.file("$project.buildDir").exists()
            }

            doFirst {
                project.copy {
                    from("$project.buildDir/reports/tests/test")
                    into("$project.rootDir/test-results")
                }
            }

            doLast {
                println "Test's results copied to new folder (test-results)"
            }
        }

    }
}
