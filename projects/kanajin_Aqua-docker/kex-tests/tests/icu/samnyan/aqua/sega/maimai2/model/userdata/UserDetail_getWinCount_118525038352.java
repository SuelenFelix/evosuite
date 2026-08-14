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

public class UserDetail_getWinCount_118525038352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225012;

    public UserDetail_getWinCount_118525038352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term225016 = new Long(8024477479047145752L);
        Integer term225079 = new Integer(1665464572);
        Integer term225081 = new Integer(-685125586);
        Integer term225083 = new Integer(708362673);
        Integer term225085 = new Integer(-630444357);
        Integer term225087 = new Integer(936421624);
        ArrayList term225077 = new ArrayList();
        ((ArrayList) term225077).add(term225079);
        ((ArrayList) term225077).add(term225081);
        ((ArrayList) term225077).add(term225083);
        ((ArrayList) term225077).add(term225085);
        ((ArrayList) term225077).add(term225087);
        Integer term225093 = new Integer(-616512894);
        Integer term225095 = new Integer(710841913);
        ArrayList term225091 = new ArrayList();
        ((ArrayList) term225091).add(term225093);
        ((ArrayList) term225091).add(term225095);
        term225012 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term225014 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term225030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term225040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225045 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term225012, term225012.getClass(), "id", 6148474143078264719L);
        setLongField(term225014, term225014.getClass(), "id", 2712208087282077512L);
        setField(term225014, term225014.getClass(), "extId", term225016);
        setField(term225014, term225014.getClass(), "luid", "QIILqPYYAT");
        setIntField(term225031, term225031.getClass(), "year", 2011);
        setShortField(term225031, term225031.getClass(), "month", (short) 11);
        setShortField(term225031, term225031.getClass(), "day", (short) 10);
        setField(term225030, term225030.getClass(), "date", term225031);
        setByteField(term225035, term225035.getClass(), "hour", (byte) 16);
        setByteField(term225035, term225035.getClass(), "minute", (byte) 19);
        setByteField(term225035, term225035.getClass(), "second", (byte) 18);
        setIntField(term225035, term225035.getClass(), "nano", 955766756);
        setField(term225030, term225030.getClass(), "time", term225035);
        setField(term225014, term225014.getClass(), "registerTime", term225030);
        setIntField(term225041, term225041.getClass(), "year", 2011);
        setShortField(term225041, term225041.getClass(), "month", (short) 3);
        setShortField(term225041, term225041.getClass(), "day", (short) 20);
        setField(term225040, term225040.getClass(), "date", term225041);
        setByteField(term225045, term225045.getClass(), "hour", (byte) 2);
        setByteField(term225045, term225045.getClass(), "minute", (byte) 22);
        setByteField(term225045, term225045.getClass(), "second", (byte) 29);
        setIntField(term225045, term225045.getClass(), "nano", 438239474);
        setField(term225040, term225040.getClass(), "time", term225045);
        setField(term225014, term225014.getClass(), "accessTime", term225040);
        setField(term225012, term225012.getClass(), "card", term225014);
        setField(term225012, term225012.getClass(), "userName", "YxSRUAFNue");
        setIntField(term225012, term225012.getClass(), "isNetMember", -1536675050);
        setIntField(term225012, term225012.getClass(), "iconId", 483222058);
        setIntField(term225012, term225012.getClass(), "plateId", 2110245271);
        setIntField(term225012, term225012.getClass(), "titleId", 1159718509);
        setIntField(term225012, term225012.getClass(), "partnerId", 1659414643);
        setIntField(term225012, term225012.getClass(), "frameId", -1342228000);
        setIntField(term225012, term225012.getClass(), "selectMapId", 715633481);
        setIntField(term225012, term225012.getClass(), "totalAwake", 1022044748);
        setIntField(term225012, term225012.getClass(), "gradeRating", 1807382811);
        setIntField(term225012, term225012.getClass(), "musicRating", -540402237);
        setIntField(term225012, term225012.getClass(), "playerRating", -1317004478);
        setIntField(term225012, term225012.getClass(), "highestRating", -1771740204);
        setIntField(term225012, term225012.getClass(), "gradeRank", 135378240);
        setIntField(term225012, term225012.getClass(), "classRank", -2017568485);
        setIntField(term225012, term225012.getClass(), "courseRank", -1312352365);
        setField(term225012, term225012.getClass(), "charaSlot", term225077);
        setField(term225012, term225012.getClass(), "charaLockSlot", term225091);
        setLongField(term225012, term225012.getClass(), "contentBit", 8315034850152527320L);
        setIntField(term225012, term225012.getClass(), "playCount", -1352021947);
        setField(term225012, term225012.getClass(), "eventWatchedDate", "lbpaurFUWq");
        setField(term225012, term225012.getClass(), "lastGameId", "uQurqKokXn");
        setField(term225012, term225012.getClass(), "lastRomVersion", "GyFudiWgJJ");
        setField(term225012, term225012.getClass(), "lastDataVersion", "bhNFHDPXAm");
        setField(term225012, term225012.getClass(), "lastLoginDate", "CWFDMUsvvv");
        setField(term225012, term225012.getClass(), "lastPlayDate", "sbgDLSAIXy");
        setIntField(term225012, term225012.getClass(), "lastPlayCredit", 1024432109);
        setIntField(term225012, term225012.getClass(), "lastPlayMode", -490684732);
        setIntField(term225012, term225012.getClass(), "lastPlaceId", 1090372481);
        setField(term225012, term225012.getClass(), "lastPlaceName", "aVfwRDxQHA");
        setIntField(term225012, term225012.getClass(), "lastAllNetId", -1392318268);
        setIntField(term225012, term225012.getClass(), "lastRegionId", 812020808);
        setField(term225012, term225012.getClass(), "lastRegionName", "uFkjaLucai");
        setField(term225012, term225012.getClass(), "lastClientId", "VBgGrYiYVS");
        setField(term225012, term225012.getClass(), "lastCountryCode", "MRyukjqCAG");
        setIntField(term225012, term225012.getClass(), "lastSelectEMoney", 1588709153);
        setIntField(term225012, term225012.getClass(), "lastSelectTicket", 1655781477);
        setIntField(term225012, term225012.getClass(), "lastSelectCourse", -1650359441);
        setIntField(term225012, term225012.getClass(), "lastCountCourse", 267957015);
        setField(term225012, term225012.getClass(), "firstGameId", "CGfwvyMUci");
        setField(term225012, term225012.getClass(), "firstRomVersion", "EuxSqUqdeF");
        setField(term225012, term225012.getClass(), "firstDataVersion", "SfweyHkybO");
        setField(term225012, term225012.getClass(), "firstPlayDate", "ygXyrMmTjT");
        setField(term225012, term225012.getClass(), "compatibleCmVersion", "lXKwQzvvCd");
        setField(term225012, term225012.getClass(), "dailyBonusDate", "zNytLLNNRg");
        setField(term225012, term225012.getClass(), "dailyCourseBonusDate", "zsWqPYKhbS");
        setField(term225012, term225012.getClass(), "lastPairLoginDate", "TPlnjYoSeR");
        setField(term225012, term225012.getClass(), "lastTrialPlayDate", "zVpUpDiXhz");
        setIntField(term225012, term225012.getClass(), "playVsCount", 1083447632);
        setIntField(term225012, term225012.getClass(), "playSyncCount", 538423507);
        setIntField(term225012, term225012.getClass(), "winCount", 1371984304);
        setIntField(term225012, term225012.getClass(), "helpCount", 1647027332);
        setIntField(term225012, term225012.getClass(), "comboCount", -1728711778);
        setLongField(term225012, term225012.getClass(), "totalDeluxscore", -7127964345767820035L);
        setLongField(term225012, term225012.getClass(), "totalBasicDeluxscore", 6114671765284809603L);
        setLongField(term225012, term225012.getClass(), "totalAdvancedDeluxscore", 8278144582669111639L);
        setLongField(term225012, term225012.getClass(), "totalExpertDeluxscore", -6819575814837205457L);
        setLongField(term225012, term225012.getClass(), "totalMasterDeluxscore", -4756184094771954959L);
        setLongField(term225012, term225012.getClass(), "totalReMasterDeluxscore", -2536916447339909561L);
        setIntField(term225012, term225012.getClass(), "totalSync", 800733694);
        setIntField(term225012, term225012.getClass(), "totalBasicSync", 1960110038);
        setIntField(term225012, term225012.getClass(), "totalAdvancedSync", 1089415716);
        setIntField(term225012, term225012.getClass(), "totalExpertSync", 2091132733);
        setIntField(term225012, term225012.getClass(), "totalMasterSync", 163419995);
        setIntField(term225012, term225012.getClass(), "totalReMasterSync", -1077085727);
        setLongField(term225012, term225012.getClass(), "totalAchievement", -9149298064523071739L);
        setLongField(term225012, term225012.getClass(), "totalBasicAchievement", 7663788351354354496L);
        setLongField(term225012, term225012.getClass(), "totalAdvancedAchievement", -9047174172809338541L);
        setLongField(term225012, term225012.getClass(), "totalExpertAchievement", 271925504540192799L);
        setLongField(term225012, term225012.getClass(), "totalMasterAchievement", 1011697063815464519L);
        setLongField(term225012, term225012.getClass(), "totalReMasterAchievement", 157713515334695998L);
        setLongField(term225012, term225012.getClass(), "playerOldRating", 5979521899424156506L);
        setLongField(term225012, term225012.getClass(), "playerNewRating", 4694388902334973006L);
        setIntField(term225012, term225012.getClass(), "banState", 839351605);
        setLongField(term225012, term225012.getClass(), "dateTime", 6568501727654064567L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term225012, args);
    }

};


