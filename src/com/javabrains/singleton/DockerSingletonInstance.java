package com.javabrains.singleton;

public class DockerSingletonInstance {

    private static volatile DockerSingletonInstance singleton_docker;

    private DockerSingletonInstance()
    {

    }

    public void logic_of_docker_instance()
    {
        /*
        *  some logic
        * */
    }

    public static DockerSingletonInstance getSingletonInstanceOfDocker()
    {
        if(singleton_docker == null)
        {
            synchronized (DockerSingletonInstance.class)
            {
                if(singleton_docker == null)
                singleton_docker = new DockerSingletonInstance();
            }
        }
        return singleton_docker;
    }

}
