# rock-n-roll-payroll

### Contents

* [Game Plan](#game-plan)
* [Assignments and Issue tracking](#assignments-and-issue-tracking)
* [Tags](#tags)
  * [Status](#status)
  * [Type](#type)
  * [Priority](#priority)
* [Tech Stack](#tech-stack)

## Game plan

This section outlines the overall set of guidelines regarding the logistics of the mentoring, specifically Rock'n roll payroll exercise.

1. Mentoring sessions are to be help twice a week (agreed days: Tuesdays and Thursdays)
2. The sessions are held without agenda, but with focus on question solving, review of advance and discussion of Rock'n roll payroll exercise.
3. The session days have a general purpose as defined below:
	* Tuesdays: follow up on current assignments, review of any pending questions or doubts
	* Thursdays: target day for deliverables, closing of issues/assignments and start of new issues/assignments
4. Use of GitHub issues and pull request to give feedback on advance is preferred (to preserve a record of discussed topics)
5. Use of Kitestring slack, or email is allowed and encouraged for more urgent matters

## Assignments and Issue tracking 

All new assignments will be entered onto this repository as [issues](https://github.com/CarterLankford/rock-n-roll-payroll/issues), with the following categories:

* To be added at a later date


Some issues may be resolved within the same issue page with no code change (for example logic problems); code changes should be perfomed according to following workflow:

1. Create a branch from master (which is the latest version of the code). The branch should be named `[issueType]/[issueId]` where `issueType` can be one of `feature` or `bugfix` and `issueId` is the number of the issue being solved (for example `feature/13`).
2. If an issue is described to be solved in multiple parts, the following branch name can be used `[issueType]/[partName]-[issueId]` (for example `feature/design-14`)
3. Once the code for the issue is finished and committed, a pull request must be opened.
4. A single commit is preferred when submitting code changes, however multiple commits are allowed if the changes are too extensive and of course to fix review comments (see below).
5. The pull request should include: reviewer (who is intended to provide feedback for this change), assignee (who is reponsible to solve any comments on the code), any tags pertinent to the issue in question (see section below for more information on tags), and the code changes should include unit testing code that covers simple cases, negative cases (triggering errors), edge cases (for efficiency exploration). Failed to cover these will lead to rejection of the pull request.
6. Once all review comments are addressed and pull request approved, the code can be merged into master and the branch will be deleted.

## Tags

The following tag groups are provided [in the repo](https://github.com/CarterLankford/rock-n-roll-payroll/labels) to help identify all issues created (including pull requests for any code submission):

### Status

These labels help identify the workflow of a given issue:

* `0-Backlog`: It's in the to-do list
* `1-Blocked`: This issue is on hold and can't be continued for the moment
* `1-Pending`: This issue requires more information before continuing
* `2-Work in Progress`: This issue is being actively worked on
* `3-Canceled`: This issue will no longer be done
* `3-Done`: Issue has been completed successfully

### Type

These labels help identifying the type of issue being created or being resolved:

* `Bug`: This issue represents a bug in the code or something that needs to be fixed. This bug wasn't caught as part of a review before.
* `Bugfix`: This is mostly for pull requests, to identify that the changes on this PR are to solve an issue
* `Challenge`: These issues contain logic problems that are aimed to deepen the understanding on a particular concept. They may or may not have code assigned to them
* `Feature`: This is a new functionality to be created/added

### Priority

These labels are used to reflect the urgency of an issue (in the case of bugs found that need immediate attention) and to organize the order in which issues are going to be resolved (on any given moment, more than one issue might be created), being `P1` the highest priority.

## Tech Stack

The following list reflects the tools needed during the session and in some cases the versions preferred (as of 06/03/2019).

**Programming**

* [Java Development Kit 8 (aka JDK 8)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

**Source Control Management**

* [Git SCM](https://git-scm.com/downloads)

**IDE**

* [Sublime Text](https://www.sublimetext.com/3)

**Software Modeling**

* [StarUML](http://staruml.io/)




Source for this readme was originally designed and implemented [here](https://github.com/CarterLankford/MentorExercises/blob/master/README.md)


