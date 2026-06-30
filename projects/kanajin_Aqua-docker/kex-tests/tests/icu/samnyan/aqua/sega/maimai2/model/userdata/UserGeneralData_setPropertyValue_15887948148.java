package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserGeneralData_setPropertyValue_15887948148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137658;

    public UserGeneralData_setPropertyValue_15887948148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137664 = new Long(-4043093655001688454L);
        Integer term137727 = new Integer(-2006508013);
        Integer term137729 = new Integer(974951631);
        Integer term137731 = new Integer(-942202284);
        Integer term137733 = new Integer(-2083254556);
        Integer term137735 = new Integer(1452346261);
        Integer term137737 = new Integer(-548776693);
        Integer term137739 = new Integer(99032275);
        ArrayList term137725 = new ArrayList();
        ((ArrayList) term137725).add(term137727);
        ((ArrayList) term137725).add(term137729);
        ((ArrayList) term137725).add(term137731);
        ((ArrayList) term137725).add(term137733);
        ((ArrayList) term137725).add(term137735);
        ((ArrayList) term137725).add(term137737);
        ((ArrayList) term137725).add(term137739);
        Integer term137745 = new Integer(794098686);
        Integer term137747 = new Integer(-1671524013);
        ArrayList term137743 = new ArrayList();
        ((ArrayList) term137743).add(term137745);
        ((ArrayList) term137743).add(term137747);
        term137658 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term137660 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term137662 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term137678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137693 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137658, term137658.getClass(), "id", 5154227867425678434L);
        setLongField(term137660, term137660.getClass(), "id", -6918265040377058945L);
        setLongField(term137662, term137662.getClass(), "id", 1480375479175046157L);
        setField(term137662, term137662.getClass(), "extId", term137664);
        setField(term137662, term137662.getClass(), "luid", "aYIchgguwD");
        setIntField(term137679, term137679.getClass(), "year", 2012);
        setShortField(term137679, term137679.getClass(), "month", (short) 6);
        setShortField(term137679, term137679.getClass(), "day", (short) 7);
        setField(term137678, term137678.getClass(), "date", term137679);
        setByteField(term137683, term137683.getClass(), "hour", (byte) 19);
        setByteField(term137683, term137683.getClass(), "minute", (byte) 20);
        setByteField(term137683, term137683.getClass(), "second", (byte) 29);
        setIntField(term137683, term137683.getClass(), "nano", 953959934);
        setField(term137678, term137678.getClass(), "time", term137683);
        setField(term137662, term137662.getClass(), "registerTime", term137678);
        setIntField(term137689, term137689.getClass(), "year", 2024);
        setShortField(term137689, term137689.getClass(), "month", (short) 3);
        setShortField(term137689, term137689.getClass(), "day", (short) 21);
        setField(term137688, term137688.getClass(), "date", term137689);
        setByteField(term137693, term137693.getClass(), "hour", (byte) 1);
        setByteField(term137693, term137693.getClass(), "minute", (byte) 21);
        setByteField(term137693, term137693.getClass(), "second", (byte) 2);
        setIntField(term137693, term137693.getClass(), "nano", 692012262);
        setField(term137688, term137688.getClass(), "time", term137693);
        setField(term137662, term137662.getClass(), "accessTime", term137688);
        setField(term137660, term137660.getClass(), "card", term137662);
        setField(term137660, term137660.getClass(), "userName", "YeMojFOdIm");
        setIntField(term137660, term137660.getClass(), "isNetMember", -637905866);
        setIntField(term137660, term137660.getClass(), "iconId", 377538185);
        setIntField(term137660, term137660.getClass(), "plateId", -2110389833);
        setIntField(term137660, term137660.getClass(), "titleId", 936155212);
        setIntField(term137660, term137660.getClass(), "partnerId", -1890572080);
        setIntField(term137660, term137660.getClass(), "frameId", -1341195642);
        setIntField(term137660, term137660.getClass(), "selectMapId", -36425470);
        setIntField(term137660, term137660.getClass(), "totalAwake", -1224302439);
        setIntField(term137660, term137660.getClass(), "gradeRating", 1290766916);
        setIntField(term137660, term137660.getClass(), "musicRating", -2679674);
        setIntField(term137660, term137660.getClass(), "playerRating", 830157799);
        setIntField(term137660, term137660.getClass(), "highestRating", 532225144);
        setIntField(term137660, term137660.getClass(), "gradeRank", 1858406662);
        setIntField(term137660, term137660.getClass(), "classRank", 991353239);
        setIntField(term137660, term137660.getClass(), "courseRank", 270036008);
        setField(term137660, term137660.getClass(), "charaSlot", term137725);
        setField(term137660, term137660.getClass(), "charaLockSlot", term137743);
        setLongField(term137660, term137660.getClass(), "contentBit", 7292580889725954907L);
        setIntField(term137660, term137660.getClass(), "playCount", 316019909);
        setField(term137660, term137660.getClass(), "eventWatchedDate", "SlRtNRtKAG");
        setField(term137660, term137660.getClass(), "lastGameId", "tjWInMuXpE");
        setField(term137660, term137660.getClass(), "lastRomVersion", "rWuFJIaxKU");
        setField(term137660, term137660.getClass(), "lastDataVersion", "YfhWIhudfM");
        setField(term137660, term137660.getClass(), "lastLoginDate", "GMoKHTpxln");
        setField(term137660, term137660.getClass(), "lastPlayDate", "XkAqnfOCnI");
        setIntField(term137660, term137660.getClass(), "lastPlayCredit", -253958157);
        setIntField(term137660, term137660.getClass(), "lastPlayMode", -491002634);
        setIntField(term137660, term137660.getClass(), "lastPlaceId", -651603671);
        setField(term137660, term137660.getClass(), "lastPlaceName", "gmQYVeuejX");
        setIntField(term137660, term137660.getClass(), "lastAllNetId", -1485310915);
        setIntField(term137660, term137660.getClass(), "lastRegionId", 931952204);
        setField(term137660, term137660.getClass(), "lastRegionName", "lKfOnfrbRD");
        setField(term137660, term137660.getClass(), "lastClientId", "nYzGCEYbnO");
        setField(term137660, term137660.getClass(), "lastCountryCode", "pmcRudWxTC");
        setIntField(term137660, term137660.getClass(), "lastSelectEMoney", -1752243259);
        setIntField(term137660, term137660.getClass(), "lastSelectTicket", 1622508431);
        setIntField(term137660, term137660.getClass(), "lastSelectCourse", 288439377);
        setIntField(term137660, term137660.getClass(), "lastCountCourse", 122193410);
        setField(term137660, term137660.getClass(), "firstGameId", "LJueGMncZI");
        setField(term137660, term137660.getClass(), "firstRomVersion", "MzACPCdnZu");
        setField(term137660, term137660.getClass(), "firstDataVersion", "orKYnrPZUK");
        setField(term137660, term137660.getClass(), "firstPlayDate", "cnXmohyKKG");
        setField(term137660, term137660.getClass(), "compatibleCmVersion", "GUOUoghpWj");
        setField(term137660, term137660.getClass(), "dailyBonusDate", "mwFuZUIQyt");
        setField(term137660, term137660.getClass(), "dailyCourseBonusDate", "vjEoebAxYI");
        setField(term137660, term137660.getClass(), "lastPairLoginDate", "yigFKTPrsp");
        setField(term137660, term137660.getClass(), "lastTrialPlayDate", "YpqweHjjwu");
        setIntField(term137660, term137660.getClass(), "playVsCount", 1299505147);
        setIntField(term137660, term137660.getClass(), "playSyncCount", 1080293155);
        setIntField(term137660, term137660.getClass(), "winCount", -538823875);
        setIntField(term137660, term137660.getClass(), "helpCount", 2138473011);
        setIntField(term137660, term137660.getClass(), "comboCount", 710964891);
        setLongField(term137660, term137660.getClass(), "totalDeluxscore", -6329353215186838591L);
        setLongField(term137660, term137660.getClass(), "totalBasicDeluxscore", 7925418162187755469L);
        setLongField(term137660, term137660.getClass(), "totalAdvancedDeluxscore", -6971795230712890698L);
        setLongField(term137660, term137660.getClass(), "totalExpertDeluxscore", -1390219565032927962L);
        setLongField(term137660, term137660.getClass(), "totalMasterDeluxscore", -1648679242770360877L);
        setLongField(term137660, term137660.getClass(), "totalReMasterDeluxscore", 4286064964693758340L);
        setIntField(term137660, term137660.getClass(), "totalSync", 597579516);
        setIntField(term137660, term137660.getClass(), "totalBasicSync", -1074602151);
        setIntField(term137660, term137660.getClass(), "totalAdvancedSync", -1806046732);
        setIntField(term137660, term137660.getClass(), "totalExpertSync", -244632280);
        setIntField(term137660, term137660.getClass(), "totalMasterSync", -364640291);
        setIntField(term137660, term137660.getClass(), "totalReMasterSync", 14738351);
        setLongField(term137660, term137660.getClass(), "totalAchievement", 4164374892238891636L);
        setLongField(term137660, term137660.getClass(), "totalBasicAchievement", 5584714342078180658L);
        setLongField(term137660, term137660.getClass(), "totalAdvancedAchievement", 7575928610718304621L);
        setLongField(term137660, term137660.getClass(), "totalExpertAchievement", 4581700942967623503L);
        setLongField(term137660, term137660.getClass(), "totalMasterAchievement", -630528110690701745L);
        setLongField(term137660, term137660.getClass(), "totalReMasterAchievement", -494884932332549971L);
        setLongField(term137660, term137660.getClass(), "playerOldRating", 8409270799800125161L);
        setLongField(term137660, term137660.getClass(), "playerNewRating", -5545139938394814214L);
        setIntField(term137660, term137660.getClass(), "banState", 2115515217);
        setLongField(term137660, term137660.getClass(), "dateTime", 8805944711185051409L);
        setField(term137658, term137658.getClass(), "user", term137660);
        setField(term137658, term137658.getClass(), "propertyKey", "RMDWjokXpG");
        setField(term137658, term137658.getClass(), "propertyValue", "INiyuixgdb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AbQcJaPuyu";
        callMethod(klass, "setPropertyValue", argTypes, term137658, args);
    }

};


