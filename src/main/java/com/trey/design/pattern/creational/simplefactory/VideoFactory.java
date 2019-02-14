package com.trey.design.pattern.creational.simplefactory;

public class VideoFactory {
    /**
     * 使用类型判断
     *
     * @param type 工厂制造类型
     * @return
     */
//    public Video getVideo(String type) {
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        } else if ("python".equals(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//    }

    /**
     * 使用反射
     *
     * @param clazz
     * @return
     */
    public Video getVideo(Class clazz) {
        Video video = null;

        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}