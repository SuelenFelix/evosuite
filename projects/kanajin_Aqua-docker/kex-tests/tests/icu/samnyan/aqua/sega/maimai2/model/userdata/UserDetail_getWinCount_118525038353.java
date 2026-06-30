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

public class UserDetail_getWinCount_118525038353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225067;

    public UserDetail_getWinCount_118525038353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term225071 = new Long(8024477479047145752L);
        Integer term225134 = new Integer(1665464572);
        Integer term225136 = new Integer(-685125586);
        Integer term225138 = new Integer(708362673);
        Integer term225140 = new Integer(-630444357);
        Integer term225142 = new Integer(936421624);
        ArrayList term225132 = new ArrayList();
        ((ArrayList) term225132).add(term225134);
        ((ArrayList) term225132).add(term225136);
        ((ArrayList) term225132).add(term225138);
        ((ArrayList) term225132).add(term225140);
        ((ArrayList) term225132).add(term225142);
        Integer term225148 = new Integer(-616512894);
        Integer term225150 = new Integer(710841913);
        ArrayList term225146 = new ArrayList();
        ((ArrayList) term225146).add(term225148);
        ((ArrayList) term225146).add(term225150);
        term225067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term225069 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term225085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term225095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term225096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225100 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term225067, term225067.getClass(), "id", 6148474143078264719L);
        setLongField(term225069, term225069.getClass(), "id", 2712208087282077512L);
        setField(term225069, term225069.getClass(), "extId", term225071);
        setField(term225069, term225069.getClass(), "luid", "QIILqPYYAT");
        setIntField(term225086, term225086.getClass(), "year", 2011);
        setShortField(term225086, term225086.getClass(), "month", (short) 11);
        setShortField(term225086, term225086.getClass(), "day", (short) 10);
        setField(term225085, term225085.getClass(), "date", term225086);
        setByteField(term225090, term225090.getClass(), "hour", (byte) 16);
        setByteField(term225090, term225090.getClass(), "minute", (byte) 19);
        setByteField(term225090, term225090.getClass(), "second", (byte) 18);
        setIntField(term225090, term225090.getClass(), "nano", 955766756);
        setField(term225085, term225085.getClass(), "time", term225090);
        setField(term225069, term225069.getClass(), "registerTime", term225085);
        setIntField(term225096, term225096.getClass(), "year", 2011);
        setShortField(term225096, term225096.getClass(), "month", (short) 3);
        setShortField(term225096, term225096.getClass(), "day", (short) 20);
        setField(term225095, term225095.getClass(), "date", term225096);
        setByteField(term225100, term225100.getClass(), "hour", (byte) 2);
        setByteField(term225100, term225100.getClass(), "minute", (byte) 22);
        setByteField(term225100, term225100.getClass(), "second", (byte) 29);
        setIntField(term225100, term225100.getClass(), "nano", 438239474);
        setField(term225095, term225095.getClass(), "time", term225100);
        setField(term225069, term225069.getClass(), "accessTime", term225095);
        setField(term225067, term225067.getClass(), "card", term225069);
        setField(term225067, term225067.getClass(), "userName", "YxSRUAFNue");
        setIntField(term225067, term225067.getClass(), "isNetMember", -1536675050);
        setIntField(term225067, term225067.getClass(), "iconId", 483222058);
        setIntField(term225067, term225067.getClass(), "plateId", 2110245271);
        setIntField(term225067, term225067.getClass(), "titleId", 1159718509);
        setIntField(term225067, term225067.getClass(), "partnerId", 1659414643);
        setIntField(term225067, term225067.getClass(), "frameId", -1342228000);
        setIntField(term225067, term225067.getClass(), "selectMapId", 715633481);
        setIntField(term225067, term225067.getClass(), "totalAwake", 1022044748);
        setIntField(term225067, term225067.getClass(), "gradeRating", 1807382811);
        setIntField(term225067, term225067.getClass(), "musicRating", -540402237);
        setIntField(term225067, term225067.getClass(), "playerRating", -1317004478);
        setIntField(term225067, term225067.getClass(), "highestRating", -1771740204);
        setIntField(term225067, term225067.getClass(), "gradeRank", 135378240);
        setIntField(term225067, term225067.getClass(), "classRank", -2017568485);
        setIntField(term225067, term225067.getClass(), "courseRank", -1312352365);
        setField(term225067, term225067.getClass(), "charaSlot", term225132);
        setField(term225067, term225067.getClass(), "charaLockSlot", term225146);
        setLongField(term225067, term225067.getClass(), "contentBit", 8315034850152527320L);
        setIntField(term225067, term225067.getClass(), "playCount", -1352021947);
        setField(term225067, term225067.getClass(), "eventWatchedDate", "lbpaurFUWq");
        setField(term225067, term225067.getClass(), "lastGameId", "uQurqKokXn");
        setField(term225067, term225067.getClass(), "lastRomVersion", "GyFudiWgJJ");
        setField(term225067, term225067.getClass(), "lastDataVersion", "bhNFHDPXAm");
        setField(term225067, term225067.getClass(), "lastLoginDate", "CWFDMUsvvv");
        setField(term225067, term225067.getClass(), "lastPlayDate", "sbgDLSAIXy");
        setIntField(term225067, term225067.getClass(), "lastPlayCredit", 1024432109);
        setIntField(term225067, term225067.getClass(), "lastPlayMode", -490684732);
        setIntField(term225067, term225067.getClass(), "lastPlaceId", 1090372481);
        setField(term225067, term225067.getClass(), "lastPlaceName", "aVfwRDxQHA");
        setIntField(term225067, term225067.getClass(), "lastAllNetId", -1392318268);
        setIntField(term225067, term225067.getClass(), "lastRegionId", 812020808);
        setField(term225067, term225067.getClass(), "lastRegionName", "uFkjaLucai");
        setField(term225067, term225067.getClass(), "lastClientId", "VBgGrYiYVS");
        setField(term225067, term225067.getClass(), "lastCountryCode", "MRyukjqCAG");
        setIntField(term225067, term225067.getClass(), "lastSelectEMoney", 1588709153);
        setIntField(term225067, term225067.getClass(), "lastSelectTicket", 1655781477);
        setIntField(term225067, term225067.getClass(), "lastSelectCourse", -1650359441);
        setIntField(term225067, term225067.getClass(), "lastCountCourse", 267957015);
        setField(term225067, term225067.getClass(), "firstGameId", "CGfwvyMUci");
        setField(term225067, term225067.getClass(), "firstRomVersion", "EuxSqUqdeF");
        setField(term225067, term225067.getClass(), "firstDataVersion", "SfweyHkybO");
        setField(term225067, term225067.getClass(), "firstPlayDate", "ygXyrMmTjT");
        setField(term225067, term225067.getClass(), "compatibleCmVersion", "lXKwQzvvCd");
        setField(term225067, term225067.getClass(), "dailyBonusDate", "zNytLLNNRg");
        setField(term225067, term225067.getClass(), "dailyCourseBonusDate", "zsWqPYKhbS");
        setField(term225067, term225067.getClass(), "lastPairLoginDate", "TPlnjYoSeR");
        setField(term225067, term225067.getClass(), "lastTrialPlayDate", "zVpUpDiXhz");
        setIntField(term225067, term225067.getClass(), "playVsCount", 1083447632);
        setIntField(term225067, term225067.getClass(), "playSyncCount", 538423507);
        setIntField(term225067, term225067.getClass(), "winCount", 1371984304);
        setIntField(term225067, term225067.getClass(), "helpCount", 1647027332);
        setIntField(term225067, term225067.getClass(), "comboCount", -1728711778);
        setLongField(term225067, term225067.getClass(), "totalDeluxscore", -7127964345767820035L);
        setLongField(term225067, term225067.getClass(), "totalBasicDeluxscore", 6114671765284809603L);
        setLongField(term225067, term225067.getClass(), "totalAdvancedDeluxscore", 8278144582669111639L);
        setLongField(term225067, term225067.getClass(), "totalExpertDeluxscore", -6819575814837205457L);
        setLongField(term225067, term225067.getClass(), "totalMasterDeluxscore", -4756184094771954959L);
        setLongField(term225067, term225067.getClass(), "totalReMasterDeluxscore", -2536916447339909561L);
        setIntField(term225067, term225067.getClass(), "totalSync", 800733694);
        setIntField(term225067, term225067.getClass(), "totalBasicSync", 1960110038);
        setIntField(term225067, term225067.getClass(), "totalAdvancedSync", 1089415716);
        setIntField(term225067, term225067.getClass(), "totalExpertSync", 2091132733);
        setIntField(term225067, term225067.getClass(), "totalMasterSync", 163419995);
        setIntField(term225067, term225067.getClass(), "totalReMasterSync", -1077085727);
        setLongField(term225067, term225067.getClass(), "totalAchievement", -9149298064523071739L);
        setLongField(term225067, term225067.getClass(), "totalBasicAchievement", 7663788351354354496L);
        setLongField(term225067, term225067.getClass(), "totalAdvancedAchievement", -9047174172809338541L);
        setLongField(term225067, term225067.getClass(), "totalExpertAchievement", 271925504540192799L);
        setLongField(term225067, term225067.getClass(), "totalMasterAchievement", 1011697063815464519L);
        setLongField(term225067, term225067.getClass(), "totalReMasterAchievement", 157713515334695998L);
        setLongField(term225067, term225067.getClass(), "playerOldRating", 5979521899424156506L);
        setLongField(term225067, term225067.getClass(), "playerNewRating", 4694388902334973006L);
        setIntField(term225067, term225067.getClass(), "banState", 839351605);
        setLongField(term225067, term225067.getClass(), "dateTime", 6568501727654064567L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term225067, args);
    }

};


