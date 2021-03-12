# Sometimes it's a README fix, or something like that - which isn't relevant for
# including in a project's CHANGELOG for example
declared_trivial = github.pr_title.include? "#trivial"

# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("PR is classed as Work in Progress") if github.pr_title.include? "[WIP]"

# Warn when there is a big PR
warn("Big PR") if git.lines_of_code > 500

# Don't let testing shortcuts get into master by accident
fail("fdescribe left in tests") if `grep -r fdescribe specs/ `.length > 1
fail("fit left in tests") if `grep -r fit specs/ `.length > 1

# project level coverage
jacoco.minimum_project_coverage_percentage = 0 # default 0

# package level coverage
jacoco.minimum_package_coverage_map = { # optional (default is empty)
  'com/' => 60
}

# coverage for individual classes
jacoco.minimum_class_coverage_map = { # optional (default is empty)
}

# only used for string output for minimum class coverage
jacoco.minimum_class_coverage_percentage = 30 # default 0

jacoco.files_extension = [".kt", ".java"] # default [".kt", ".java"]

jacoco.report("app/build/reports/jacoco/debug/jacoco.xml", "http://jacoco-html-reports/")
