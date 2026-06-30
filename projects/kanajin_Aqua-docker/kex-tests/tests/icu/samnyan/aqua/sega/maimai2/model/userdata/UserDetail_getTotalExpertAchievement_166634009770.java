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

public class UserDetail_getTotalExpertAchievement_166634009770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4269208;

    public UserDetail_getTotalExpertAchievement_166634009770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4269212 = new Long(766037242790737165L);
        Integer term4269275 = new Integer(2032116097);
        Integer term4269277 = new Integer(-1529610099);
        ArrayList term4269273 = new ArrayList();
        ((ArrayList) term4269273).add(term4269275);
        ((ArrayList) term4269273).add(term4269277);
        Integer term4269283 = new Integer(101565487);
        Integer term4269285 = new Integer(-1974519039);
        ArrayList term4269281 = new ArrayList();
        ((ArrayList) term4269281).add(term4269283);
        ((ArrayList) term4269281).add(term4269285);
        term4269208 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4269210 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4269226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4269227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4269231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4269236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4269237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4269241 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4269208, term4269208.getClass(), "id", -3131636826454962277L);
        setLongField(term4269210, term4269210.getClass(), "id", -7572157425754400548L);
        setField(term4269210, term4269210.getClass(), "extId", term4269212);
        setField(term4269210, term4269210.getClass(), "luid", "kGnNKYuVtI");
        setIntField(term4269227, term4269227.getClass(), "year", 2027);
        setShortField(term4269227, term4269227.getClass(), "month", (short) 6);
        setShortField(term4269227, term4269227.getClass(), "day", (short) 9);
        setField(term4269226, term4269226.getClass(), "date", term4269227);
        setByteField(term4269231, term4269231.getClass(), "hour", (byte) 12);
        setByteField(term4269231, term4269231.getClass(), "minute", (byte) 0);
        setByteField(term4269231, term4269231.getClass(), "second", (byte) 49);
        setIntField(term4269231, term4269231.getClass(), "nano", 878105630);
        setField(term4269226, term4269226.getClass(), "time", term4269231);
        setField(term4269210, term4269210.getClass(), "registerTime", term4269226);
        setIntField(term4269237, term4269237.getClass(), "year", 2012);
        setShortField(term4269237, term4269237.getClass(), "month", (short) 6);
        setShortField(term4269237, term4269237.getClass(), "day", (short) 16);
        setField(term4269236, term4269236.getClass(), "date", term4269237);
        setByteField(term4269241, term4269241.getClass(), "hour", (byte) 10);
        setByteField(term4269241, term4269241.getClass(), "minute", (byte) 0);
        setByteField(term4269241, term4269241.getClass(), "second", (byte) 56);
        setIntField(term4269241, term4269241.getClass(), "nano", 869181421);
        setField(term4269236, term4269236.getClass(), "time", term4269241);
        setField(term4269210, term4269210.getClass(), "accessTime", term4269236);
        setField(term4269208, term4269208.getClass(), "card", term4269210);
        setField(term4269208, term4269208.getClass(), "userName", "KIvkmzRKsG");
        setIntField(term4269208, term4269208.getClass(), "isNetMember", 1608730934);
        setIntField(term4269208, term4269208.getClass(), "iconId", -7215542);
        setIntField(term4269208, term4269208.getClass(), "plateId", 901948096);
        setIntField(term4269208, term4269208.getClass(), "titleId", -306138633);
        setIntField(term4269208, term4269208.getClass(), "partnerId", -773683808);
        setIntField(term4269208, term4269208.getClass(), "frameId", -1174405351);
        setIntField(term4269208, term4269208.getClass(), "selectMapId", 760759915);
        setIntField(term4269208, term4269208.getClass(), "totalAwake", -1540494899);
        setIntField(term4269208, term4269208.getClass(), "gradeRating", 1701012577);
        setIntField(term4269208, term4269208.getClass(), "musicRating", -2074058294);
        setIntField(term4269208, term4269208.getClass(), "playerRating", 1239614786);
        setIntField(term4269208, term4269208.getClass(), "highestRating", -872250056);
        setIntField(term4269208, term4269208.getClass(), "gradeRank", -1640496298);
        setIntField(term4269208, term4269208.getClass(), "classRank", 1159164882);
        setIntField(term4269208, term4269208.getClass(), "courseRank", -1346031906);
        setField(term4269208, term4269208.getClass(), "charaSlot", term4269273);
        setField(term4269208, term4269208.getClass(), "charaLockSlot", term4269281);
        setLongField(term4269208, term4269208.getClass(), "contentBit", -863559997471090663L);
        setIntField(term4269208, term4269208.getClass(), "playCount", -479319983);
        setField(term4269208, term4269208.getClass(), "eventWatchedDate", "EPtyytoKQS");
        setField(term4269208, term4269208.getClass(), "lastGameId", "FHoxGNeFGm");
        setField(term4269208, term4269208.getClass(), "lastRomVersion", "jtqmCMZdBA");
        setField(term4269208, term4269208.getClass(), "lastDataVersion", "oUrLnKelrn");
        setField(term4269208, term4269208.getClass(), "lastLoginDate", "ZJNQxEISpT");
        setField(term4269208, term4269208.getClass(), "lastPlayDate", "fSCiCGMGDZ");
        setIntField(term4269208, term4269208.getClass(), "lastPlayCredit", -1330353079);
        setIntField(term4269208, term4269208.getClass(), "lastPlayMode", -590354064);
        setIntField(term4269208, term4269208.getClass(), "lastPlaceId", 1660566238);
        setField(term4269208, term4269208.getClass(), "lastPlaceName", "QoAJrBhWOQ");
        setIntField(term4269208, term4269208.getClass(), "lastAllNetId", 1136834828);
        setIntField(term4269208, term4269208.getClass(), "lastRegionId", -1150911558);
        setField(term4269208, term4269208.getClass(), "lastRegionName", "wAnHiGnvUB");
        setField(term4269208, term4269208.getClass(), "lastClientId", "CeavnJlhvB");
        setField(term4269208, term4269208.getClass(), "lastCountryCode", "jdVfWqYhhi");
        setIntField(term4269208, term4269208.getClass(), "lastSelectEMoney", -1479794909);
        setIntField(term4269208, term4269208.getClass(), "lastSelectTicket", 2080905043);
        setIntField(term4269208, term4269208.getClass(), "lastSelectCourse", 1959827405);
        setIntField(term4269208, term4269208.getClass(), "lastCountCourse", -1600196638);
        setField(term4269208, term4269208.getClass(), "firstGameId", "FvfWjpmghS");
        setField(term4269208, term4269208.getClass(), "firstRomVersion", "zZvqajBNgO");
        setField(term4269208, term4269208.getClass(), "firstDataVersion", "inhMoogfmV");
        setField(term4269208, term4269208.getClass(), "firstPlayDate", "xKnJXwZHDc");
        setField(term4269208, term4269208.getClass(), "compatibleCmVersion", "bFZHDWupJG");
        setField(term4269208, term4269208.getClass(), "dailyBonusDate", "XCQqyOOnnD");
        setField(term4269208, term4269208.getClass(), "dailyCourseBonusDate", "tjQeZrtqlE");
        setField(term4269208, term4269208.getClass(), "lastPairLoginDate", "cFVJmvyjwQ");
        setField(term4269208, term4269208.getClass(), "lastTrialPlayDate", "ZsFRrnYqfJ");
        setIntField(term4269208, term4269208.getClass(), "playVsCount", -1871767972);
        setIntField(term4269208, term4269208.getClass(), "playSyncCount", 759986526);
        setIntField(term4269208, term4269208.getClass(), "winCount", 1953844545);
        setIntField(term4269208, term4269208.getClass(), "helpCount", -976362508);
        setIntField(term4269208, term4269208.getClass(), "comboCount", 990644597);
        setLongField(term4269208, term4269208.getClass(), "totalDeluxscore", 1087287654948755528L);
        setLongField(term4269208, term4269208.getClass(), "totalBasicDeluxscore", 2724994739039848473L);
        setLongField(term4269208, term4269208.getClass(), "totalAdvancedDeluxscore", -7144439025552312229L);
        setLongField(term4269208, term4269208.getClass(), "totalExpertDeluxscore", 8379804234073031627L);
        setLongField(term4269208, term4269208.getClass(), "totalMasterDeluxscore", -7792184830642605173L);
        setLongField(term4269208, term4269208.getClass(), "totalReMasterDeluxscore", 7303915851142056864L);
        setIntField(term4269208, term4269208.getClass(), "totalSync", -432270312);
        setIntField(term4269208, term4269208.getClass(), "totalBasicSync", -704200341);
        setIntField(term4269208, term4269208.getClass(), "totalAdvancedSync", -434816091);
        setIntField(term4269208, term4269208.getClass(), "totalExpertSync", -796472607);
        setIntField(term4269208, term4269208.getClass(), "totalMasterSync", -1960584783);
        setIntField(term4269208, term4269208.getClass(), "totalReMasterSync", 1699893245);
        setLongField(term4269208, term4269208.getClass(), "totalAchievement", 3389456492407692580L);
        setLongField(term4269208, term4269208.getClass(), "totalBasicAchievement", 7138069662488893453L);
        setLongField(term4269208, term4269208.getClass(), "totalAdvancedAchievement", 2586753932062502068L);
        setLongField(term4269208, term4269208.getClass(), "totalExpertAchievement", 1907106754631691662L);
        setLongField(term4269208, term4269208.getClass(), "totalMasterAchievement", 8277601634075696041L);
        setLongField(term4269208, term4269208.getClass(), "totalReMasterAchievement", -4523816280417243923L);
        setLongField(term4269208, term4269208.getClass(), "playerOldRating", -4712989519597504200L);
        setLongField(term4269208, term4269208.getClass(), "playerNewRating", 1956466179592954819L);
        setIntField(term4269208, term4269208.getClass(), "banState", 983024366);
        setLongField(term4269208, term4269208.getClass(), "dateTime", -23828082979825537L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertAchievement", argTypes, term4269208, args);
    }

};


