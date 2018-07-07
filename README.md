<!--## TEST
https://docs.google.com/forms/d/e/1FAIpQLSds22wMgvvrQAn9rNlf0pGJ_x7V52W1xE9t9yUU_Ay6Jjl16Q/viewform?usp=sf_link-->

# WICHTIG
Das Tutorium ist nun beendet. Informationen über einen gesonderten Termin vor der Prüfung erhaltet ihr per Mail.


## Fragen aus dem Quiz

1.  Was ist eine Instanz?
2. Mit welchem Schlüsselwort erbt man von einer Klasse?
3. Mit welchem Schlüsselwort implementiert man ein Interface?
4. Was ist ein Interface?
5. Mit welchem Schlüsselwort ruft man eine Methode in der Super-Klasse auf?
6. Wie ruft man den Konstruktor des eigenen Klasse auf?
7. Mit welchem Schlüsselwort greift man auf eine Variable in der eigenen Objekt zu?
8. Mit welchem Schlüsselwort kann man einen Methodenblock verlassen
9. Mit welchem Schlüsselwort gibt man etwas aus einer Methode zurück
10. Mit welchem Schlüsselwort kann man eine Schleife abbrechen
11. Welche Privacymodifikatoren gibt es?
12. Was ist der Standardwert einer int-Variable
13. Was ist ein int
14. Was ist ein String
15. Was ist ein Boolean
16. Welche Methode wird auf einem Objekt ausgeführt wenn es gesprintet werden soll
17. Was ist ein Iterator
18. Welche Methoden hat ein Iterator
19. Welche Schleifen gibt es
20. Mit welchem Schlüsselwort wird eine Konstante definiert?
21. Was macht das Schlüsselwort static

## Beispiele
Im Modul Exkurs sind ab jetzt Beispiele zu einigen im Tutorium behandelten Themen zu finden.

## Git Commands

### Getting & Creating Projects

| Command | Description |
| ------- | ----------- |
| `git init` | Initialize a local Git repository |
| `git clone ssh://git@github.com/[username]/[repository-name].git` | Create a local copy of a remote repository |

### Basic Snapshotting

| Command | Description |
| ------- | ----------- |
| `git status` | Check status |
| `git add [file-name.txt]` | Add a file to the staging area |
| `git add -A` | Add all new and changed files to the staging area |
| `git commit -m "[commit message]"` | Commit changes |
| `git rm -r [file-name.txt]` | Remove a file (or folder) |

### Branching & Merging

| Command | Description |
| ------- | ----------- |
| `git branch` | List branches (the asterisk denotes the current branch) |
| `git branch -a` | List all branches (local and remote) |
| `git branch [branch name]` | Create a new branch |
| `git branch -d [branch name]` | Delete a branch |
| `git push origin --delete [branchName]` | Delete a remote branch |
| `git checkout -b [branch name]` | Create a new branch and switch to it |
| `git checkout -b [branch name] origin/[branch name]` | Clone a remote branch and switch to it |
| `git checkout [branch name]` | Switch to a branch |
| `git checkout -` | Switch to the branch last checked out |
| `git checkout -- [file-name.txt]` | Discard changes to a file |
| `git merge [branch name]` | Merge a branch into the active branch |
| `git merge [source branch] [target branch]` | Merge a branch into a target branch |
| `git stash` | Stash changes in a dirty working directory |
| `git stash clear` | Remove all stashed entries |

### Sharing & Updating Projects

| Command | Description |
| ------- | ----------- |
| `git push origin [branch name]` | Push a branch to your remote repository |
| `git push -u origin [branch name]` | Push changes to remote repository (and remember the branch) |
| `git push` | Push changes to remote repository (remembered branch) |
| `git push origin --delete [branch name]` | Delete a remote branch |
| `git pull` | Update local repository to the newest commit |
| `git pull origin [branch name]` | Pull changes from remote repository |
| `git remote add origin ssh://git@github.com/[username]/[repository-name].git` | Add a remote repository |
| `git remote set-url origin ssh://git@github.com/[username]/[repository-name].git` | Set a repository's origin branch to SSH |

### Inspection & Comparison

| Command | Description |
| ------- | ----------- |
| `git log` | View changes |
| `git log --summary` | View changes (detailed) |
| `git diff [source branch] [target branch}` | Preview changes before merging |

