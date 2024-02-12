fun printIfDaemon(thread: Thread) {
    if (thread.isDaemon) {
        print("daemon")
    } else print("not daemon")

}
