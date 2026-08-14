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

public class UserDetail_setCompatibleCmVersion_1076667535122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264992;

    public UserDetail_setCompatibleCmVersion_1076667535122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term264996 = new Long(-6399462725251497844L);
        Integer term265059 = new Integer(-1085076149);
        Integer term265061 = new Integer(2037214602);
        Integer term265063 = new Integer(1791859428);
        Integer term265065 = new Integer(313791373);
        Integer term265067 = new Integer(-1757202955);
        ArrayList term265057 = new ArrayList();
        ((ArrayList) term265057).add(term265059);
        ((ArrayList) term265057).add(term265061);
        ((ArrayList) term265057).add(term265063);
        ((ArrayList) term265057).add(term265065);
        ((ArrayList) term265057).add(term265067);
        Integer term265073 = new Integer(-1618822811);
        Integer term265075 = new Integer(-850405849);
        Integer term265077 = new Integer(-545145172);
        Integer term265079 = new Integer(-2069653687);
        Integer term265081 = new Integer(-1832612963);
        Integer term265083 = new Integer(1064073662);
        Integer term265085 = new Integer(1120854991);
        Integer term265087 = new Integer(1448504845);
        Integer term265089 = new Integer(451612513);
        ArrayList term265071 = new ArrayList();
        ((ArrayList) term265071).add(term265073);
        ((ArrayList) term265071).add(term265075);
        ((ArrayList) term265071).add(term265077);
        ((ArrayList) term265071).add(term265079);
        ((ArrayList) term265071).add(term265081);
        ((ArrayList) term265071).add(term265083);
        ((ArrayList) term265071).add(term265085);
        ((ArrayList) term265071).add(term265087);
        ((ArrayList) term265071).add(term265089);
        term264992 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term264994 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term265010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term265020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265025 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term264992, term264992.getClass(), "id", 5037864653120858928L);
        setLongField(term264994, term264994.getClass(), "id", 6587433799480548610L);
        setField(term264994, term264994.getClass(), "extId", term264996);
        setField(term264994, term264994.getClass(), "luid", "kEeOXwuQLs");
        setIntField(term265011, term265011.getClass(), "year", 2024);
        setShortField(term265011, term265011.getClass(), "month", (short) 1);
        setShortField(term265011, term265011.getClass(), "day", (short) 2);
        setField(term265010, term265010.getClass(), "date", term265011);
        setByteField(term265015, term265015.getClass(), "hour", (byte) 11);
        setByteField(term265015, term265015.getClass(), "minute", (byte) 57);
        setByteField(term265015, term265015.getClass(), "second", (byte) 11);
        setIntField(term265015, term265015.getClass(), "nano", 372467179);
        setField(term265010, term265010.getClass(), "time", term265015);
        setField(term264994, term264994.getClass(), "registerTime", term265010);
        setIntField(term265021, term265021.getClass(), "year", 2027);
        setShortField(term265021, term265021.getClass(), "month", (short) 8);
        setShortField(term265021, term265021.getClass(), "day", (short) 9);
        setField(term265020, term265020.getClass(), "date", term265021);
        setByteField(term265025, term265025.getClass(), "hour", (byte) 20);
        setByteField(term265025, term265025.getClass(), "minute", (byte) 47);
        setByteField(term265025, term265025.getClass(), "second", (byte) 18);
        setIntField(term265025, term265025.getClass(), "nano", 296781163);
        setField(term265020, term265020.getClass(), "time", term265025);
        setField(term264994, term264994.getClass(), "accessTime", term265020);
        setField(term264992, term264992.getClass(), "card", term264994);
        setField(term264992, term264992.getClass(), "userName", "MyeSojBBPn");
        setIntField(term264992, term264992.getClass(), "isNetMember", 546560504);
        setIntField(term264992, term264992.getClass(), "iconId", -1289216870);
        setIntField(term264992, term264992.getClass(), "plateId", -1788717665);
        setIntField(term264992, term264992.getClass(), "titleId", 1618168148);
        setIntField(term264992, term264992.getClass(), "partnerId", 1565876587);
        setIntField(term264992, term264992.getClass(), "frameId", -480885839);
        setIntField(term264992, term264992.getClass(), "selectMapId", 464342395);
        setIntField(term264992, term264992.getClass(), "totalAwake", 1596861681);
        setIntField(term264992, term264992.getClass(), "gradeRating", 867687605);
        setIntField(term264992, term264992.getClass(), "musicRating", 827594613);
        setIntField(term264992, term264992.getClass(), "playerRating", -1402852908);
        setIntField(term264992, term264992.getClass(), "highestRating", -221528448);
        setIntField(term264992, term264992.getClass(), "gradeRank", 231614322);
        setIntField(term264992, term264992.getClass(), "classRank", 1911982519);
        setIntField(term264992, term264992.getClass(), "courseRank", -246377509);
        setField(term264992, term264992.getClass(), "charaSlot", term265057);
        setField(term264992, term264992.getClass(), "charaLockSlot", term265071);
        setLongField(term264992, term264992.getClass(), "contentBit", 715928652863208461L);
        setIntField(term264992, term264992.getClass(), "playCount", 173988221);
        setField(term264992, term264992.getClass(), "eventWatchedDate", "IBEiicEMis");
        setField(term264992, term264992.getClass(), "lastGameId", "bWUMMMnrsO");
        setField(term264992, term264992.getClass(), "lastRomVersion", "QMuSzIUAqW");
        setField(term264992, term264992.getClass(), "lastDataVersion", "ecDNTpPdOH");
        setField(term264992, term264992.getClass(), "lastLoginDate", "BsVYnEehhF");
        setField(term264992, term264992.getClass(), "lastPlayDate", "YwJlByssSF");
        setIntField(term264992, term264992.getClass(), "lastPlayCredit", -1062462809);
        setIntField(term264992, term264992.getClass(), "lastPlayMode", 263324057);
        setIntField(term264992, term264992.getClass(), "lastPlaceId", -1978777233);
        setField(term264992, term264992.getClass(), "lastPlaceName", "EWbLFcROZq");
        setIntField(term264992, term264992.getClass(), "lastAllNetId", -1727096369);
        setIntField(term264992, term264992.getClass(), "lastRegionId", -715689449);
        setField(term264992, term264992.getClass(), "lastRegionName", "uZkkVJREva");
        setField(term264992, term264992.getClass(), "lastClientId", "lYGZmmgWDd");
        setField(term264992, term264992.getClass(), "lastCountryCode", "YzjQFbbtMR");
        setIntField(term264992, term264992.getClass(), "lastSelectEMoney", -928679856);
        setIntField(term264992, term264992.getClass(), "lastSelectTicket", 1866091658);
        setIntField(term264992, term264992.getClass(), "lastSelectCourse", -1857761236);
        setIntField(term264992, term264992.getClass(), "lastCountCourse", 1011954389);
        setField(term264992, term264992.getClass(), "firstGameId", "iyFhYDVxSB");
        setField(term264992, term264992.getClass(), "firstRomVersion", "wqmAianxQK");
        setField(term264992, term264992.getClass(), "firstDataVersion", "FbERbbZMNs");
        setField(term264992, term264992.getClass(), "firstPlayDate", "qKghCzRGvs");
        setField(term264992, term264992.getClass(), "compatibleCmVersion", "zpshVYDLcR");
        setField(term264992, term264992.getClass(), "dailyBonusDate", "jbBXnlcBeK");
        setField(term264992, term264992.getClass(), "dailyCourseBonusDate", "uascBPqTuU");
        setField(term264992, term264992.getClass(), "lastPairLoginDate", "dFOpjLmNnE");
        setField(term264992, term264992.getClass(), "lastTrialPlayDate", "CCgshdCJTR");
        setIntField(term264992, term264992.getClass(), "playVsCount", 2058624555);
        setIntField(term264992, term264992.getClass(), "playSyncCount", 2069499390);
        setIntField(term264992, term264992.getClass(), "winCount", 1294260412);
        setIntField(term264992, term264992.getClass(), "helpCount", -1539938534);
        setIntField(term264992, term264992.getClass(), "comboCount", 1847970773);
        setLongField(term264992, term264992.getClass(), "totalDeluxscore", 4396504561946474535L);
        setLongField(term264992, term264992.getClass(), "totalBasicDeluxscore", 3844450004074143505L);
        setLongField(term264992, term264992.getClass(), "totalAdvancedDeluxscore", -1740284702060208885L);
        setLongField(term264992, term264992.getClass(), "totalExpertDeluxscore", -2232111476551710317L);
        setLongField(term264992, term264992.getClass(), "totalMasterDeluxscore", -2756740577699684804L);
        setLongField(term264992, term264992.getClass(), "totalReMasterDeluxscore", -964404979332043830L);
        setIntField(term264992, term264992.getClass(), "totalSync", -1180930206);
        setIntField(term264992, term264992.getClass(), "totalBasicSync", -1203324932);
        setIntField(term264992, term264992.getClass(), "totalAdvancedSync", -1265613992);
        setIntField(term264992, term264992.getClass(), "totalExpertSync", -402209834);
        setIntField(term264992, term264992.getClass(), "totalMasterSync", -1641289658);
        setIntField(term264992, term264992.getClass(), "totalReMasterSync", 2014093797);
        setLongField(term264992, term264992.getClass(), "totalAchievement", 1083206868616667634L);
        setLongField(term264992, term264992.getClass(), "totalBasicAchievement", 1235115449997449326L);
        setLongField(term264992, term264992.getClass(), "totalAdvancedAchievement", 1145114767481539662L);
        setLongField(term264992, term264992.getClass(), "totalExpertAchievement", -6414532060545105249L);
        setLongField(term264992, term264992.getClass(), "totalMasterAchievement", 5133996666025986534L);
        setLongField(term264992, term264992.getClass(), "totalReMasterAchievement", -7896098173261351418L);
        setLongField(term264992, term264992.getClass(), "playerOldRating", 1094798158959312513L);
        setLongField(term264992, term264992.getClass(), "playerNewRating", 2001123814972566842L);
        setIntField(term264992, term264992.getClass(), "banState", -556201841);
        setLongField(term264992, term264992.getClass(), "dateTime", 725802133371329566L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tObTOEkwsm";
        callMethod(klass, "setCompatibleCmVersion", argTypes, term264992, args);
    }

};


