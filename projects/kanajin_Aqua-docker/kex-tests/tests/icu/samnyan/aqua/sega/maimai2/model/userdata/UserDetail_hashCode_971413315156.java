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

public class UserDetail_hashCode_971413315156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4318589;

    public UserDetail_hashCode_971413315156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4318593 = new Long(-2262970860436884733L);
        Integer term4318656 = new Integer(1689577386);
        Integer term4318658 = new Integer(20929363);
        ArrayList term4318654 = new ArrayList();
        ((ArrayList) term4318654).add(term4318656);
        ((ArrayList) term4318654).add(term4318658);
        Integer term4318664 = new Integer(1997659725);
        Integer term4318666 = new Integer(-982053590);
        Integer term4318668 = new Integer(-1866750250);
        Integer term4318670 = new Integer(1106745170);
        ArrayList term4318662 = new ArrayList();
        ((ArrayList) term4318662).add(term4318664);
        ((ArrayList) term4318662).add(term4318666);
        ((ArrayList) term4318662).add(term4318668);
        ((ArrayList) term4318662).add(term4318670);
        term4318589 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4318591 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4318607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4318608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4318612 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4318617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4318618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4318622 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4318589, term4318589.getClass(), "id", 8059019848716323462L);
        setLongField(term4318591, term4318591.getClass(), "id", -5627849990745571659L);
        setField(term4318591, term4318591.getClass(), "extId", term4318593);
        setField(term4318591, term4318591.getClass(), "luid", "EobvohJxlH");
        setIntField(term4318608, term4318608.getClass(), "year", 2011);
        setShortField(term4318608, term4318608.getClass(), "month", (short) 6);
        setShortField(term4318608, term4318608.getClass(), "day", (short) 8);
        setField(term4318607, term4318607.getClass(), "date", term4318608);
        setByteField(term4318612, term4318612.getClass(), "hour", (byte) 18);
        setByteField(term4318612, term4318612.getClass(), "minute", (byte) 39);
        setByteField(term4318612, term4318612.getClass(), "second", (byte) 23);
        setIntField(term4318612, term4318612.getClass(), "nano", 630263406);
        setField(term4318607, term4318607.getClass(), "time", term4318612);
        setField(term4318591, term4318591.getClass(), "registerTime", term4318607);
        setIntField(term4318618, term4318618.getClass(), "year", 2025);
        setShortField(term4318618, term4318618.getClass(), "month", (short) 12);
        setShortField(term4318618, term4318618.getClass(), "day", (short) 25);
        setField(term4318617, term4318617.getClass(), "date", term4318618);
        setByteField(term4318622, term4318622.getClass(), "hour", (byte) 11);
        setByteField(term4318622, term4318622.getClass(), "minute", (byte) 22);
        setByteField(term4318622, term4318622.getClass(), "second", (byte) 21);
        setIntField(term4318622, term4318622.getClass(), "nano", 367979733);
        setField(term4318617, term4318617.getClass(), "time", term4318622);
        setField(term4318591, term4318591.getClass(), "accessTime", term4318617);
        setField(term4318589, term4318589.getClass(), "card", term4318591);
        setField(term4318589, term4318589.getClass(), "userName", "ogBtlmeEZz");
        setIntField(term4318589, term4318589.getClass(), "isNetMember", -2115479907);
        setIntField(term4318589, term4318589.getClass(), "iconId", 545203382);
        setIntField(term4318589, term4318589.getClass(), "plateId", 1565874198);
        setIntField(term4318589, term4318589.getClass(), "titleId", 238841608);
        setIntField(term4318589, term4318589.getClass(), "partnerId", -2000691839);
        setIntField(term4318589, term4318589.getClass(), "frameId", 2126292422);
        setIntField(term4318589, term4318589.getClass(), "selectMapId", -1685150390);
        setIntField(term4318589, term4318589.getClass(), "totalAwake", -1850266482);
        setIntField(term4318589, term4318589.getClass(), "gradeRating", -2049922781);
        setIntField(term4318589, term4318589.getClass(), "musicRating", -123408327);
        setIntField(term4318589, term4318589.getClass(), "playerRating", -610436691);
        setIntField(term4318589, term4318589.getClass(), "highestRating", -1948386769);
        setIntField(term4318589, term4318589.getClass(), "gradeRank", 414934957);
        setIntField(term4318589, term4318589.getClass(), "classRank", 270022347);
        setIntField(term4318589, term4318589.getClass(), "courseRank", -1412530663);
        setField(term4318589, term4318589.getClass(), "charaSlot", term4318654);
        setField(term4318589, term4318589.getClass(), "charaLockSlot", term4318662);
        setLongField(term4318589, term4318589.getClass(), "contentBit", 8693648739733116026L);
        setIntField(term4318589, term4318589.getClass(), "playCount", 388138085);
        setField(term4318589, term4318589.getClass(), "eventWatchedDate", "ApMNlfBbVM");
        setField(term4318589, term4318589.getClass(), "lastGameId", "HzJxsesbIs");
        setField(term4318589, term4318589.getClass(), "lastRomVersion", "VBJINUKjkx");
        setField(term4318589, term4318589.getClass(), "lastDataVersion", "fAXXkBBluh");
        setField(term4318589, term4318589.getClass(), "lastLoginDate", "uMXpyCldDS");
        setField(term4318589, term4318589.getClass(), "lastPlayDate", "LIXAPBQKES");
        setIntField(term4318589, term4318589.getClass(), "lastPlayCredit", 1152218489);
        setIntField(term4318589, term4318589.getClass(), "lastPlayMode", 496008446);
        setIntField(term4318589, term4318589.getClass(), "lastPlaceId", 266834042);
        setField(term4318589, term4318589.getClass(), "lastPlaceName", "ZcIraZWfNP");
        setIntField(term4318589, term4318589.getClass(), "lastAllNetId", -1681079640);
        setIntField(term4318589, term4318589.getClass(), "lastRegionId", -1772778846);
        setField(term4318589, term4318589.getClass(), "lastRegionName", "jOphOeUdeZ");
        setField(term4318589, term4318589.getClass(), "lastClientId", "IcUdmRXfnO");
        setField(term4318589, term4318589.getClass(), "lastCountryCode", "tWJHHsiiQf");
        setIntField(term4318589, term4318589.getClass(), "lastSelectEMoney", -1447921895);
        setIntField(term4318589, term4318589.getClass(), "lastSelectTicket", -926237312);
        setIntField(term4318589, term4318589.getClass(), "lastSelectCourse", 111608082);
        setIntField(term4318589, term4318589.getClass(), "lastCountCourse", 385691095);
        setField(term4318589, term4318589.getClass(), "firstGameId", "sFTulGDfmE");
        setField(term4318589, term4318589.getClass(), "firstRomVersion", "wZoWMPexEz");
        setField(term4318589, term4318589.getClass(), "firstDataVersion", "iBChStdczv");
        setField(term4318589, term4318589.getClass(), "firstPlayDate", "vPGDuGYvdc");
        setField(term4318589, term4318589.getClass(), "compatibleCmVersion", "MpKBWnwNTi");
        setField(term4318589, term4318589.getClass(), "dailyBonusDate", "fUAOzplFkm");
        setField(term4318589, term4318589.getClass(), "dailyCourseBonusDate", "MUnFbRdJDp");
        setField(term4318589, term4318589.getClass(), "lastPairLoginDate", "OVyqtKsUCQ");
        setField(term4318589, term4318589.getClass(), "lastTrialPlayDate", "hCOeKaUbXt");
        setIntField(term4318589, term4318589.getClass(), "playVsCount", 2143151732);
        setIntField(term4318589, term4318589.getClass(), "playSyncCount", 669163920);
        setIntField(term4318589, term4318589.getClass(), "winCount", 640573509);
        setIntField(term4318589, term4318589.getClass(), "helpCount", 726007922);
        setIntField(term4318589, term4318589.getClass(), "comboCount", 284227059);
        setLongField(term4318589, term4318589.getClass(), "totalDeluxscore", -4506883524285799264L);
        setLongField(term4318589, term4318589.getClass(), "totalBasicDeluxscore", 3517435382201380711L);
        setLongField(term4318589, term4318589.getClass(), "totalAdvancedDeluxscore", 8808830203142605578L);
        setLongField(term4318589, term4318589.getClass(), "totalExpertDeluxscore", -5302825276835707100L);
        setLongField(term4318589, term4318589.getClass(), "totalMasterDeluxscore", -8947091065336881740L);
        setLongField(term4318589, term4318589.getClass(), "totalReMasterDeluxscore", -4498109490409415034L);
        setIntField(term4318589, term4318589.getClass(), "totalSync", 1732207867);
        setIntField(term4318589, term4318589.getClass(), "totalBasicSync", -781127796);
        setIntField(term4318589, term4318589.getClass(), "totalAdvancedSync", -60344375);
        setIntField(term4318589, term4318589.getClass(), "totalExpertSync", 807819983);
        setIntField(term4318589, term4318589.getClass(), "totalMasterSync", -905263247);
        setIntField(term4318589, term4318589.getClass(), "totalReMasterSync", 582010176);
        setLongField(term4318589, term4318589.getClass(), "totalAchievement", 68699492004974677L);
        setLongField(term4318589, term4318589.getClass(), "totalBasicAchievement", 806323787345205985L);
        setLongField(term4318589, term4318589.getClass(), "totalAdvancedAchievement", -1508964019530629183L);
        setLongField(term4318589, term4318589.getClass(), "totalExpertAchievement", 8842532226229322702L);
        setLongField(term4318589, term4318589.getClass(), "totalMasterAchievement", 3861839318028484936L);
        setLongField(term4318589, term4318589.getClass(), "totalReMasterAchievement", 5962987262565546797L);
        setLongField(term4318589, term4318589.getClass(), "playerOldRating", -5819741691089353636L);
        setLongField(term4318589, term4318589.getClass(), "playerNewRating", 4193816287910277485L);
        setIntField(term4318589, term4318589.getClass(), "banState", 733534146);
        setLongField(term4318589, term4318589.getClass(), "dateTime", 8210104924513167990L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4318589, args);
    }

};


