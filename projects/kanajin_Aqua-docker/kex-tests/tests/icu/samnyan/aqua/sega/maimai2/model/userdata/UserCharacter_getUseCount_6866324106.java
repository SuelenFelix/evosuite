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

public class UserCharacter_getUseCount_6866324106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187997;

    public UserCharacter_getUseCount_6866324106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188003 = new Long(2722004046017350471L);
        Integer term188066 = new Integer(1164105108);
        Integer term188068 = new Integer(-972073241);
        Integer term188070 = new Integer(643112473);
        ArrayList term188064 = new ArrayList();
        ((ArrayList) term188064).add(term188066);
        ((ArrayList) term188064).add(term188068);
        ((ArrayList) term188064).add(term188070);
        Integer term188076 = new Integer(-1141492053);
        ArrayList term188074 = new ArrayList();
        ((ArrayList) term188074).add(term188076);
        term187997 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term187999 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term188001 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term188017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188032 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187997, term187997.getClass(), "id", -5802097793900081339L);
        setLongField(term187999, term187999.getClass(), "id", -4896356265370003983L);
        setLongField(term188001, term188001.getClass(), "id", -8079990214114446951L);
        setField(term188001, term188001.getClass(), "extId", term188003);
        setField(term188001, term188001.getClass(), "luid", "ZptVUzLPCw");
        setIntField(term188018, term188018.getClass(), "year", 2023);
        setShortField(term188018, term188018.getClass(), "month", (short) 5);
        setShortField(term188018, term188018.getClass(), "day", (short) 24);
        setField(term188017, term188017.getClass(), "date", term188018);
        setByteField(term188022, term188022.getClass(), "hour", (byte) 7);
        setByteField(term188022, term188022.getClass(), "minute", (byte) 37);
        setByteField(term188022, term188022.getClass(), "second", (byte) 7);
        setIntField(term188022, term188022.getClass(), "nano", 648887020);
        setField(term188017, term188017.getClass(), "time", term188022);
        setField(term188001, term188001.getClass(), "registerTime", term188017);
        setIntField(term188028, term188028.getClass(), "year", 2029);
        setShortField(term188028, term188028.getClass(), "month", (short) 8);
        setShortField(term188028, term188028.getClass(), "day", (short) 9);
        setField(term188027, term188027.getClass(), "date", term188028);
        setByteField(term188032, term188032.getClass(), "hour", (byte) 15);
        setByteField(term188032, term188032.getClass(), "minute", (byte) 45);
        setByteField(term188032, term188032.getClass(), "second", (byte) 28);
        setIntField(term188032, term188032.getClass(), "nano", 584909169);
        setField(term188027, term188027.getClass(), "time", term188032);
        setField(term188001, term188001.getClass(), "accessTime", term188027);
        setField(term187999, term187999.getClass(), "card", term188001);
        setField(term187999, term187999.getClass(), "userName", "PhxaskGUox");
        setIntField(term187999, term187999.getClass(), "isNetMember", -1625230288);
        setIntField(term187999, term187999.getClass(), "iconId", -171798351);
        setIntField(term187999, term187999.getClass(), "plateId", 1331490909);
        setIntField(term187999, term187999.getClass(), "titleId", -1361172730);
        setIntField(term187999, term187999.getClass(), "partnerId", 1833435218);
        setIntField(term187999, term187999.getClass(), "frameId", -1718069812);
        setIntField(term187999, term187999.getClass(), "selectMapId", 1138412605);
        setIntField(term187999, term187999.getClass(), "totalAwake", 1718167201);
        setIntField(term187999, term187999.getClass(), "gradeRating", 1431553192);
        setIntField(term187999, term187999.getClass(), "musicRating", 953855887);
        setIntField(term187999, term187999.getClass(), "playerRating", 631485155);
        setIntField(term187999, term187999.getClass(), "highestRating", -1352413368);
        setIntField(term187999, term187999.getClass(), "gradeRank", 1935994916);
        setIntField(term187999, term187999.getClass(), "classRank", 710260184);
        setIntField(term187999, term187999.getClass(), "courseRank", -1659608527);
        setField(term187999, term187999.getClass(), "charaSlot", term188064);
        setField(term187999, term187999.getClass(), "charaLockSlot", term188074);
        setLongField(term187999, term187999.getClass(), "contentBit", -9121863504856704916L);
        setIntField(term187999, term187999.getClass(), "playCount", 1859912957);
        setField(term187999, term187999.getClass(), "eventWatchedDate", "PqySjixIoc");
        setField(term187999, term187999.getClass(), "lastGameId", "QCJXeGbEor");
        setField(term187999, term187999.getClass(), "lastRomVersion", "TwCbrCjzwL");
        setField(term187999, term187999.getClass(), "lastDataVersion", "hOZqhvhcjq");
        setField(term187999, term187999.getClass(), "lastLoginDate", "zNPOnpEodJ");
        setField(term187999, term187999.getClass(), "lastPlayDate", "KVzirWEvHZ");
        setIntField(term187999, term187999.getClass(), "lastPlayCredit", 1423682963);
        setIntField(term187999, term187999.getClass(), "lastPlayMode", -672568445);
        setIntField(term187999, term187999.getClass(), "lastPlaceId", 1927405731);
        setField(term187999, term187999.getClass(), "lastPlaceName", "MEuRnwyHJN");
        setIntField(term187999, term187999.getClass(), "lastAllNetId", 1901138263);
        setIntField(term187999, term187999.getClass(), "lastRegionId", -1587806226);
        setField(term187999, term187999.getClass(), "lastRegionName", "mXAcZWCaIl");
        setField(term187999, term187999.getClass(), "lastClientId", "wxQIQXYisx");
        setField(term187999, term187999.getClass(), "lastCountryCode", "PtuPKKkQqS");
        setIntField(term187999, term187999.getClass(), "lastSelectEMoney", -1782020561);
        setIntField(term187999, term187999.getClass(), "lastSelectTicket", -1107385404);
        setIntField(term187999, term187999.getClass(), "lastSelectCourse", -524207375);
        setIntField(term187999, term187999.getClass(), "lastCountCourse", -590671889);
        setField(term187999, term187999.getClass(), "firstGameId", "kgVwdNODbO");
        setField(term187999, term187999.getClass(), "firstRomVersion", "yEORGYKBvc");
        setField(term187999, term187999.getClass(), "firstDataVersion", "vgSfMyOiip");
        setField(term187999, term187999.getClass(), "firstPlayDate", "nsBmlIaWyH");
        setField(term187999, term187999.getClass(), "compatibleCmVersion", "UOdzdFoNYj");
        setField(term187999, term187999.getClass(), "dailyBonusDate", "ZwBPdbsbRN");
        setField(term187999, term187999.getClass(), "dailyCourseBonusDate", "IQnlZuBQxZ");
        setField(term187999, term187999.getClass(), "lastPairLoginDate", "hzcJWOOcer");
        setField(term187999, term187999.getClass(), "lastTrialPlayDate", "yaNlisVBqV");
        setIntField(term187999, term187999.getClass(), "playVsCount", -1418367417);
        setIntField(term187999, term187999.getClass(), "playSyncCount", -2130236957);
        setIntField(term187999, term187999.getClass(), "winCount", -1477513467);
        setIntField(term187999, term187999.getClass(), "helpCount", 1784364775);
        setIntField(term187999, term187999.getClass(), "comboCount", -1405043904);
        setLongField(term187999, term187999.getClass(), "totalDeluxscore", -4459179453474120410L);
        setLongField(term187999, term187999.getClass(), "totalBasicDeluxscore", 2755379365736921497L);
        setLongField(term187999, term187999.getClass(), "totalAdvancedDeluxscore", -2208763219528665359L);
        setLongField(term187999, term187999.getClass(), "totalExpertDeluxscore", -8331765952428714962L);
        setLongField(term187999, term187999.getClass(), "totalMasterDeluxscore", -8419887083771361951L);
        setLongField(term187999, term187999.getClass(), "totalReMasterDeluxscore", 382074525446048429L);
        setIntField(term187999, term187999.getClass(), "totalSync", -2106459386);
        setIntField(term187999, term187999.getClass(), "totalBasicSync", 412901715);
        setIntField(term187999, term187999.getClass(), "totalAdvancedSync", 63312590);
        setIntField(term187999, term187999.getClass(), "totalExpertSync", 1065136159);
        setIntField(term187999, term187999.getClass(), "totalMasterSync", 235554079);
        setIntField(term187999, term187999.getClass(), "totalReMasterSync", -1928935865);
        setLongField(term187999, term187999.getClass(), "totalAchievement", 4945879608228215842L);
        setLongField(term187999, term187999.getClass(), "totalBasicAchievement", 3687726401872154598L);
        setLongField(term187999, term187999.getClass(), "totalAdvancedAchievement", -865131657054854580L);
        setLongField(term187999, term187999.getClass(), "totalExpertAchievement", 1011331685296452545L);
        setLongField(term187999, term187999.getClass(), "totalMasterAchievement", 5146027058171164355L);
        setLongField(term187999, term187999.getClass(), "totalReMasterAchievement", -2692218180683745222L);
        setLongField(term187999, term187999.getClass(), "playerOldRating", -1619797161891252512L);
        setLongField(term187999, term187999.getClass(), "playerNewRating", 6115895261247894187L);
        setIntField(term187999, term187999.getClass(), "banState", 36720539);
        setLongField(term187999, term187999.getClass(), "dateTime", 7095337677763783504L);
        setField(term187997, term187997.getClass(), "user", term187999);
        setIntField(term187997, term187997.getClass(), "characterId", 1238203454);
        setIntField(term187997, term187997.getClass(), "level", 1392215933);
        setIntField(term187997, term187997.getClass(), "awakening", -1780970662);
        setIntField(term187997, term187997.getClass(), "useCount", 1092997590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUseCount", argTypes, term187997, args);
    }

};


