package net.jaggerwang.sbip.adapter.api.controller.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_UserDTOBuilder_updatedAt_4069057589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33445;
     Object term33670;

    public UserDTO_UserDTOBuilder_updatedAt_4069057589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33446 = new Long(-6265886087280835813L);
        Long term33496 = new Long(8408467837292297525L);
        Long term33531 = new Long(-5157976075409724332L);
        Long term33533 = new Long(5638814204437933939L);
        Class<? extends Object> term33731 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term33730 = ((Class) term33731).getDeclaredField((String) "LOCAL");
        ((Field) term33730).setAccessible(true);
        Object enum65 = ((Field) term33730).get((Object) null);
        Long term33581 = new Long(-5717327658642389548L);
        HashMap term33627 = new HashMap();
        Long term33636 = new Long(8495724482241106293L);
        Long term33638 = new Long(-4318584834500248968L);
        Long term33640 = new Long(-7839957570751440706L);
        Long term33642 = new Long(-4944032768681866361L);
        Long term33644 = new Long(-6657309314982735134L);
        Long term33646 = new Long(-685001356309682920L);
        Boolean term33668 = new Boolean(false);
        term33445 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term33510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33530 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term33568 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term33595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33635 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term33648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term33445, term33445.getClass(), "id", term33446);
        setField(term33445, term33445.getClass(), "username", "mNgDshwZNc");
        setField(term33445, term33445.getClass(), "password", "pDqgDbJoFw");
        setField(term33445, term33445.getClass(), "mobile", "iVOvTzOxwt");
        setField(term33445, term33445.getClass(), "email", "BjZQdecXvB");
        setField(term33445, term33445.getClass(), "avatarId", term33496);
        setField(term33445, term33445.getClass(), "intro", "iUkOOQhEkw");
        setIntField(term33511, term33511.getClass(), "year", 2014);
        setShortField(term33511, term33511.getClass(), "month", (short) 6);
        setShortField(term33511, term33511.getClass(), "day", (short) 12);
        setField(term33510, term33510.getClass(), "date", term33511);
        setByteField(term33515, term33515.getClass(), "hour", (byte) 5);
        setByteField(term33515, term33515.getClass(), "minute", (byte) 4);
        setByteField(term33515, term33515.getClass(), "second", (byte) 20);
        setIntField(term33515, term33515.getClass(), "nano", 169602296);
        setField(term33510, term33510.getClass(), "time", term33515);
        setField(term33445, term33445.getClass(), "createdAt", term33510);
        setIntField(term33521, term33521.getClass(), "year", 2021);
        setShortField(term33521, term33521.getClass(), "month", (short) 5);
        setShortField(term33521, term33521.getClass(), "day", (short) 13);
        setField(term33520, term33520.getClass(), "date", term33521);
        setByteField(term33525, term33525.getClass(), "hour", (byte) 15);
        setByteField(term33525, term33525.getClass(), "minute", (byte) 40);
        setByteField(term33525, term33525.getClass(), "second", (byte) 27);
        setIntField(term33525, term33525.getClass(), "nano", 319035378);
        setField(term33520, term33520.getClass(), "time", term33525);
        setField(term33445, term33445.getClass(), "updatedAt", term33520);
        setField(term33530, term33530.getClass(), "id", term33531);
        setField(term33530, term33530.getClass(), "userId", term33533);
        setField(term33530, term33530.getClass(), "region", enum65);
        setField(term33530, term33530.getClass(), "bucket", "wmVoFoUVmU");
        setField(term33530, term33530.getClass(), "path", "lLiSiPCciB");
        setField(term33568, term33568.getClass(), "name", "PsMKIIEwdR");
        setField(term33568, term33568.getClass(), "size", term33581);
        setField(term33568, term33568.getClass(), "type", "RbQmXqfXAT");
        setField(term33530, term33530.getClass(), "meta", term33568);
        setIntField(term33596, term33596.getClass(), "year", 2012);
        setShortField(term33596, term33596.getClass(), "month", (short) 5);
        setShortField(term33596, term33596.getClass(), "day", (short) 21);
        setField(term33595, term33595.getClass(), "date", term33596);
        setByteField(term33600, term33600.getClass(), "hour", (byte) 19);
        setByteField(term33600, term33600.getClass(), "minute", (byte) 56);
        setByteField(term33600, term33600.getClass(), "second", (byte) 3);
        setIntField(term33600, term33600.getClass(), "nano", 266247153);
        setField(term33595, term33595.getClass(), "time", term33600);
        setField(term33530, term33530.getClass(), "createdAt", term33595);
        setIntField(term33606, term33606.getClass(), "year", 2029);
        setShortField(term33606, term33606.getClass(), "month", (short) 2);
        setShortField(term33606, term33606.getClass(), "day", (short) 4);
        setField(term33605, term33605.getClass(), "date", term33606);
        setByteField(term33610, term33610.getClass(), "hour", (byte) 18);
        setByteField(term33610, term33610.getClass(), "minute", (byte) 31);
        setByteField(term33610, term33610.getClass(), "second", (byte) 27);
        setIntField(term33610, term33610.getClass(), "nano", 737016275);
        setField(term33605, term33605.getClass(), "time", term33610);
        setField(term33530, term33530.getClass(), "updatedAt", term33605);
        setField(term33530, term33530.getClass(), "url", "fcCAsvfBbe");
        setField(term33530, term33530.getClass(), "thumbs", term33627);
        setField(term33445, term33445.getClass(), "avatar", term33530);
        setField(term33635, term33635.getClass(), "id", term33636);
        setField(term33635, term33635.getClass(), "userId", term33638);
        setField(term33635, term33635.getClass(), "postCount", term33640);
        setField(term33635, term33635.getClass(), "likeCount", term33642);
        setField(term33635, term33635.getClass(), "followingCount", term33644);
        setField(term33635, term33635.getClass(), "followerCount", term33646);
        setIntField(term33649, term33649.getClass(), "year", 2022);
        setShortField(term33649, term33649.getClass(), "month", (short) 3);
        setShortField(term33649, term33649.getClass(), "day", (short) 27);
        setField(term33648, term33648.getClass(), "date", term33649);
        setByteField(term33653, term33653.getClass(), "hour", (byte) 18);
        setByteField(term33653, term33653.getClass(), "minute", (byte) 52);
        setByteField(term33653, term33653.getClass(), "second", (byte) 30);
        setIntField(term33653, term33653.getClass(), "nano", 610437590);
        setField(term33648, term33648.getClass(), "time", term33653);
        setField(term33635, term33635.getClass(), "createdAt", term33648);
        setIntField(term33659, term33659.getClass(), "year", 2020);
        setShortField(term33659, term33659.getClass(), "month", (short) 10);
        setShortField(term33659, term33659.getClass(), "day", (short) 10);
        setField(term33658, term33658.getClass(), "date", term33659);
        setByteField(term33663, term33663.getClass(), "hour", (byte) 8);
        setByteField(term33663, term33663.getClass(), "minute", (byte) 35);
        setByteField(term33663, term33663.getClass(), "second", (byte) 54);
        setIntField(term33663, term33663.getClass(), "nano", 115111505);
        setField(term33658, term33658.getClass(), "time", term33663);
        setField(term33635, term33635.getClass(), "updatedAt", term33658);
        setField(term33445, term33445.getClass(), "stat", term33635);
        setField(term33445, term33445.getClass(), "following", term33668);
        term33670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33675 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33671, term33671.getClass(), "year", 2017);
        setShortField(term33671, term33671.getClass(), "month", (short) 10);
        setShortField(term33671, term33671.getClass(), "day", (short) 24);
        setField(term33670, term33670.getClass(), "date", term33671);
        setByteField(term33675, term33675.getClass(), "hour", (byte) 21);
        setByteField(term33675, term33675.getClass(), "minute", (byte) 10);
        setByteField(term33675, term33675.getClass(), "second", (byte) 20);
        setIntField(term33675, term33675.getClass(), "nano", 736076804);
        setField(term33670, term33670.getClass(), "time", term33675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term33670;
        callMethod(klass, "updatedAt", argTypes, term33445, args);
    }

};


