package com.example.myapplication

open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun printDeviceName() {
        println("Device name is $name.")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
    override fun printDeviceName() {
        println("Device name is $name.")
    }
}

class SmartHome(val name : String, val smartTvDevice: SmartTvDevice) {

    fun turnOnTv() {
        smartTvDevice.deviceStatus = "online"
    }

    fun turnOffTv() {
        smartTvDevice.deviceStatus = "offline"
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun nextTvChannel() {
        smartTvDevice.nextChannel()
    }
}


fun main() {
    val smartDevice = SmartDevice("Smart Bulb", "Lighting")
    println(smartDevice.deviceStatus)
    val smartDevice2 = SmartDevice("Smart Bulb", "Lighting", 0)
    println(smartDevice2.deviceStatus)

    val smartTvDevice = SmartTvDevice("Smart TV", "Entertainment")
    println(smartTvDevice.deviceStatus)
    smartTvDevice.increaseSpeakerVolume()
    smartTvDevice.nextChannel()
    println(smartTvDevice.deviceStatus)
    smartTvDevice.printDeviceName()

}
