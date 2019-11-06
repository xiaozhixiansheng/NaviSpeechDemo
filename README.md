@[TOC](科大讯飞 android 语音合成 demo)
> **导读** 最近在做一个导航项目，需要用到语音合成，官方的demo版本都是太老，在Android Studio上基本跑不起来，改来改去的，浪费了很多时间。总之，十分不适合新手操作，这一点必须吐槽！！！

##### 前期准备
1. 那个啥，平台应用创建啥的，这里就不写了，附上[官方教程](https://www.xfyun.cn/doc/platform/quickguide.html#%E7%AC%AC%E4%B8%80%E6%AD%A5%EF%BC%9A%E6%B3%A8%E5%86%8C%E6%88%90%E4%B8%BA%E5%BC%80%E5%8F%91%E8%80%85)，他这里讲的详细一点，我们直接从sdk下载完成后开始
2. 创建新的工程(这里是Demo，如果是老手，可以跳过)
##### 修改工程下的build.gradle
* 在android{}中添加如下代码
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191106105317896.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0FDSmFjaw==,size_16,color_FFFFFF,t_70)
##### 导入SDK
1. 将下载的SDK解压，并将libs目录下的文件拷贝至项目中对应的目录下(将项目视图改成Project方便一些)，记住，拷贝完之后，选中Msc.jar文件右击鼠标键，然后选择Add As Library...
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191106104549987.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0FDSmFjaw==,size_16,color_FFFFFF,t_70)
2. 需要注意的是，导入的SDK要与应用平台上所创建的应用相对应，否则后面运行代码会出现*10407*错误代码

##### 代码
1. 官方的代码虽然不能运行，但是，还是值得借鉴
2. 这里就附上我自己的代码(亲测，可用): https://github.com/xiaozhixiansheng/NaviSpeechDemo
3. 如果运行不了，试着把项目里的SDK和appId改成自己的
