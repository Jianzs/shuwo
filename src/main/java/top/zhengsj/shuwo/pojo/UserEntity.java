package top.zhengsj.shuwo.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
// XML文件中的根标识
@XmlRootElement(name = "user")
// 控制JAXB 绑定类中属性和字段的排序
@XmlType(propOrder = {
        "name",
        "phone",
        "password",
        "seatId",
        "roomId",
        "deviceId",
        "enabled",
        "addEnabled",
        "affirmEnabled",
        "releaseEnabled",
        "userId",
        "token",
        "newSeatAppointmentId",
        "oldSeatAppointmentId"
})
public class UserEntity {
    private String name;
    private String phone;
    private String password;
    private String userId;
    private String token;
    private String deviceId;
    private Integer seatId;
    private Boolean enabled = false;
    private Boolean addEnabled = true;
    private Boolean affirmEnabled = true;
    private Boolean releaseEnabled = true;
    private Integer roomId;

    private String newSeatAppointmentId;
    private String oldSeatAppointmentId;

    public UserEntity() {
    }

    public UserEntity(String name, String phone, String password, String deviceId, Integer seatId) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.deviceId = deviceId;
        this.seatId = seatId;
    }

    public Boolean getAddEnabled() {
        return addEnabled;
    }

    public void setAddEnabled(Boolean addEnabled) {
        this.addEnabled = addEnabled;
    }

    public Boolean getAffirmEnabled() {
        return affirmEnabled;
    }

    public void setAffirmEnabled(Boolean affirmEnabled) {
        this.affirmEnabled = affirmEnabled;
    }

    public Boolean getReleaseEnabled() {
        return releaseEnabled;
    }

    public void setReleaseEnabled(Boolean releaseEnabled) {
        this.releaseEnabled = releaseEnabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNewSeatAppointmentId() {
        return newSeatAppointmentId;
    }

    public void setNewSeatAppointmentId(String newSeatAppointmentId) {
        this.newSeatAppointmentId = newSeatAppointmentId;
    }

    public String getOldSeatAppointmentId() {
        return oldSeatAppointmentId;
    }

    public void setOldSeatAppointmentId(String oldSeatAppointmentId) {
        this.oldSeatAppointmentId = oldSeatAppointmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", seatId=" + seatId +
                ", enabled=" + enabled +
                ", newSeatAppointmentId='" + newSeatAppointmentId + '\'' +
                ", oldSeatAppointmentId='" + oldSeatAppointmentId + '\'' +
                '}';
    }
}
