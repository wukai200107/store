package com.yupi.project.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_preference
 */
@TableName(value ="t_preference")
@Data
public class TPreference implements Serializable {
    /**
     * 	
可选值：工作日偏好、工作时间偏好、班次时长偏好。可扩展
     */
    private String preferencetype;

    /**
     * 	
当员工没有选择对应的偏好类型时，表示员工对该类型无特殊偏好。
     */
    private String staff;

    /**
     * 	
需要开发者自行设计。

示例：

- 工作日偏好的值：1,3,4     表示偏好周一、周三、周四工作。

- 工作时间偏好的值：08:00-12:00,18:00:22:00 表示偏好上午8点到12点和晚上6点到10点工作
     */
    private String preferencevalue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TPreference other = (TPreference) that;
        return (this.getPreferencetype() == null ? other.getPreferencetype() == null : this.getPreferencetype().equals(other.getPreferencetype()))
            && (this.getStaff() == null ? other.getStaff() == null : this.getStaff().equals(other.getStaff()))
            && (this.getPreferencevalue() == null ? other.getPreferencevalue() == null : this.getPreferencevalue().equals(other.getPreferencevalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPreferencetype() == null) ? 0 : getPreferencetype().hashCode());
        result = prime * result + ((getStaff() == null) ? 0 : getStaff().hashCode());
        result = prime * result + ((getPreferencevalue() == null) ? 0 : getPreferencevalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preferencetype=").append(preferencetype);
        sb.append(", staff=").append(staff);
        sb.append(", preferencevalue=").append(preferencevalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}