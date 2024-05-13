# -*- coding: utf-8 -*-
"""To Do List.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1EMVFy--vdqMDVGvV0miygfRZVpfiIHUe
"""

class ToDoList:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def view_tasks(self):
        for i, task in enumerate(self.tasks, 1):
            print(f"{i}. {task}")

    def update_task(self, task_number, new_task):
        if task_number > 0 and task_number <= len(self.tasks):
            self.tasks[task_number - 1] = new_task
        else:
            print("Invalid task number")

    def delete_task(self, task_number):
        if task_number > 0 and task_number <= len(self.tasks):
            del self.tasks[task_number - 1]
        else:
            print("Invalid task number")


def main():
    todo_list = ToDoList()

    while True:
        print("\n1. Add Task\n2. View Tasks\n3. Update Task\n4. Delete Task\n5. Quit")
        choice = input("Enter your choice: ")

        if choice == '1':
            task = input("Enter the task: ")
            todo_list.add_task(task)
            print("Task Added!!")
        elif choice == '2':
            todo_list.view_tasks()
        elif choice == '3':
            task_number = int(input("Enter the task number to update: "))
            new_task = input("Enter the new task: ")
            todo_list.update_task(task_number, new_task)
            print("Task Updated!!")
        elif choice == '4':
            task_number = int(input("Enter the task number to delete: "))
            todo_list.delete_task(task_number)
            print("Task Deleted!!")
        elif choice == '5':
            break
        else:
            print("Invalid choice")


if __name__ == "__main__":
    main()