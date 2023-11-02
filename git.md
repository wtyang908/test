echo "# hellogit1" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/wuyi0013/hellogit1.git
git push -u origin main



`git branch -a` 这个命令在 Git 版本控制系统中被用来列出仓库中的所有分支，包括本地和远程分支。

```
git branch branch_name
```

创建一个新分支，将 `branch_name` 替换为你想要给新分支的名字。

```
git checkout branch_name
```

切换分支

```
git checkout -b branch_name
```

创建并切换



```
git push --set-upstream origin branch_name
```

将 `branch_name` 替换为你的本地分支名。这个命令会创建一个同名的远程分支，并将你的本地分支与之关联。



在 Git 中，`origin` 并不是一个分支，而是远程仓库的默认名称。当你克隆一个仓库时，Git 会自动给这个远程仓库设置名字 `origin`。这是一个约定俗成的标准，用于引用你的主要远程仓库。

例如，如果你从 GitHub 克隆了一个仓库，Git 就会自动为这个远程仓库创建一个名为 `origin` 的引用。你可以使用这个名称来引用远程仓库，而不需要输入完整的 URL。

举几个例子来说明 `origin` 是如何被使用的：

1. **拉取远程更改**：
   ```bash
   git pull origin master
   ```
   这个命令表示从 `origin` 远程仓库的 `master` 分支拉取更改。

2. **推送本地更改**：
   ```bash
   git push origin feature_x
   ```
   这意味着将本地的 `feature_x` 分支推送到 `origin` 远程仓库的 `feature_x` 分支。

3. **查看远程仓库的信息**：
   ```bash
   git remote show origin
   ```
   这个命令用于显示有关 `origin` 远程仓库的详细信息。

