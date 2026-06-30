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

public class UserDetail_setCompatibleCmVersion_1076667535123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265047;

    public UserDetail_setCompatibleCmVersion_1076667535123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term265051 = new Long(-6399462725251497844L);
        Integer term265114 = new Integer(-1085076149);
        Integer term265116 = new Integer(2037214602);
        Integer term265118 = new Integer(1791859428);
        Integer term265120 = new Integer(313791373);
        Integer term265122 = new Integer(-1757202955);
        ArrayList term265112 = new ArrayList();
        ((ArrayList) term265112).add(term265114);
        ((ArrayList) term265112).add(term265116);
        ((ArrayList) term265112).add(term265118);
        ((ArrayList) term265112).add(term265120);
        ((ArrayList) term265112).add(term265122);
        Integer term265128 = new Integer(-1618822811);
        Integer term265130 = new Integer(-850405849);
        Integer term265132 = new Integer(-545145172);
        Integer term265134 = new Integer(-2069653687);
        Integer term265136 = new Integer(-1832612963);
        Integer term265138 = new Integer(1064073662);
        Integer term265140 = new Integer(1120854991);
        Integer term265142 = new Integer(1448504845);
        Integer term265144 = new Integer(451612513);
        ArrayList term265126 = new ArrayList();
        ((ArrayList) term265126).add(term265128);
        ((ArrayList) term265126).add(term265130);
        ((ArrayList) term265126).add(term265132);
        ((ArrayList) term265126).add(term265134);
        ((ArrayList) term265126).add(term265136);
        ((ArrayList) term265126).add(term265138);
        ((ArrayList) term265126).add(term265140);
        ((ArrayList) term265126).add(term265142);
        ((ArrayList) term265126).add(term265144);
        term265047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term265049 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term265065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term265075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term265047, term265047.getClass(), "id", 5037864653120858928L);
        setLongField(term265049, term265049.getClass(), "id", 6587433799480548610L);
        setField(term265049, term265049.getClass(), "extId", term265051);
        setField(term265049, term265049.getClass(), "luid", "kEeOXwuQLs");
        setIntField(term265066, term265066.getClass(), "year", 2024);
        setShortField(term265066, term265066.getClass(), "month", (short) 1);
        setShortField(term265066, term265066.getClass(), "day", (short) 2);
        setField(term265065, term265065.getClass(), "date", term265066);
        setByteField(term265070, term265070.getClass(), "hour", (byte) 11);
        setByteField(term265070, term265070.getClass(), "minute", (byte) 57);
        setByteField(term265070, term265070.getClass(), "second", (byte) 11);
        setIntField(term265070, term265070.getClass(), "nano", 372467179);
        setField(term265065, term265065.getClass(), "time", term265070);
        setField(term265049, term265049.getClass(), "registerTime", term265065);
        setIntField(term265076, term265076.getClass(), "year", 2027);
        setShortField(term265076, term265076.getClass(), "month", (short) 8);
        setShortField(term265076, term265076.getClass(), "day", (short) 9);
        setField(term265075, term265075.getClass(), "date", term265076);
        setByteField(term265080, term265080.getClass(), "hour", (byte) 20);
        setByteField(term265080, term265080.getClass(), "minute", (byte) 47);
        setByteField(term265080, term265080.getClass(), "second", (byte) 18);
        setIntField(term265080, term265080.getClass(), "nano", 296781163);
        setField(term265075, term265075.getClass(), "time", term265080);
        setField(term265049, term265049.getClass(), "accessTime", term265075);
        setField(term265047, term265047.getClass(), "card", term265049);
        setField(term265047, term265047.getClass(), "userName", "MyeSojBBPn");
        setIntField(term265047, term265047.getClass(), "isNetMember", 546560504);
        setIntField(term265047, term265047.getClass(), "iconId", -1289216870);
        setIntField(term265047, term265047.getClass(), "plateId", -1788717665);
        setIntField(term265047, term265047.getClass(), "titleId", 1618168148);
        setIntField(term265047, term265047.getClass(), "partnerId", 1565876587);
        setIntField(term265047, term265047.getClass(), "frameId", -480885839);
        setIntField(term265047, term265047.getClass(), "selectMapId", 464342395);
        setIntField(term265047, term265047.getClass(), "totalAwake", 1596861681);
        setIntField(term265047, term265047.getClass(), "gradeRating", 867687605);
        setIntField(term265047, term265047.getClass(), "musicRating", 827594613);
        setIntField(term265047, term265047.getClass(), "playerRating", -1402852908);
        setIntField(term265047, term265047.getClass(), "highestRating", -221528448);
        setIntField(term265047, term265047.getClass(), "gradeRank", 231614322);
        setIntField(term265047, term265047.getClass(), "classRank", 1911982519);
        setIntField(term265047, term265047.getClass(), "courseRank", -246377509);
        setField(term265047, term265047.getClass(), "charaSlot", term265112);
        setField(term265047, term265047.getClass(), "charaLockSlot", term265126);
        setLongField(term265047, term265047.getClass(), "contentBit", 715928652863208461L);
        setIntField(term265047, term265047.getClass(), "playCount", 173988221);
        setField(term265047, term265047.getClass(), "eventWatchedDate", "IBEiicEMis");
        setField(term265047, term265047.getClass(), "lastGameId", "bWUMMMnrsO");
        setField(term265047, term265047.getClass(), "lastRomVersion", "QMuSzIUAqW");
        setField(term265047, term265047.getClass(), "lastDataVersion", "ecDNTpPdOH");
        setField(term265047, term265047.getClass(), "lastLoginDate", "BsVYnEehhF");
        setField(term265047, term265047.getClass(), "lastPlayDate", "YwJlByssSF");
        setIntField(term265047, term265047.getClass(), "lastPlayCredit", -1062462809);
        setIntField(term265047, term265047.getClass(), "lastPlayMode", 263324057);
        setIntField(term265047, term265047.getClass(), "lastPlaceId", -1978777233);
        setField(term265047, term265047.getClass(), "lastPlaceName", "EWbLFcROZq");
        setIntField(term265047, term265047.getClass(), "lastAllNetId", -1727096369);
        setIntField(term265047, term265047.getClass(), "lastRegionId", -715689449);
        setField(term265047, term265047.getClass(), "lastRegionName", "uZkkVJREva");
        setField(term265047, term265047.getClass(), "lastClientId", "lYGZmmgWDd");
        setField(term265047, term265047.getClass(), "lastCountryCode", "YzjQFbbtMR");
        setIntField(term265047, term265047.getClass(), "lastSelectEMoney", -928679856);
        setIntField(term265047, term265047.getClass(), "lastSelectTicket", 1866091658);
        setIntField(term265047, term265047.getClass(), "lastSelectCourse", -1857761236);
        setIntField(term265047, term265047.getClass(), "lastCountCourse", 1011954389);
        setField(term265047, term265047.getClass(), "firstGameId", "iyFhYDVxSB");
        setField(term265047, term265047.getClass(), "firstRomVersion", "wqmAianxQK");
        setField(term265047, term265047.getClass(), "firstDataVersion", "FbERbbZMNs");
        setField(term265047, term265047.getClass(), "firstPlayDate", "qKghCzRGvs");
        setField(term265047, term265047.getClass(), "compatibleCmVersion", "zpshVYDLcR");
        setField(term265047, term265047.getClass(), "dailyBonusDate", "jbBXnlcBeK");
        setField(term265047, term265047.getClass(), "dailyCourseBonusDate", "uascBPqTuU");
        setField(term265047, term265047.getClass(), "lastPairLoginDate", "dFOpjLmNnE");
        setField(term265047, term265047.getClass(), "lastTrialPlayDate", "CCgshdCJTR");
        setIntField(term265047, term265047.getClass(), "playVsCount", 2058624555);
        setIntField(term265047, term265047.getClass(), "playSyncCount", 2069499390);
        setIntField(term265047, term265047.getClass(), "winCount", 1294260412);
        setIntField(term265047, term265047.getClass(), "helpCount", -1539938534);
        setIntField(term265047, term265047.getClass(), "comboCount", 1847970773);
        setLongField(term265047, term265047.getClass(), "totalDeluxscore", 4396504561946474535L);
        setLongField(term265047, term265047.getClass(), "totalBasicDeluxscore", 3844450004074143505L);
        setLongField(term265047, term265047.getClass(), "totalAdvancedDeluxscore", -1740284702060208885L);
        setLongField(term265047, term265047.getClass(), "totalExpertDeluxscore", -2232111476551710317L);
        setLongField(term265047, term265047.getClass(), "totalMasterDeluxscore", -2756740577699684804L);
        setLongField(term265047, term265047.getClass(), "totalReMasterDeluxscore", -964404979332043830L);
        setIntField(term265047, term265047.getClass(), "totalSync", -1180930206);
        setIntField(term265047, term265047.getClass(), "totalBasicSync", -1203324932);
        setIntField(term265047, term265047.getClass(), "totalAdvancedSync", -1265613992);
        setIntField(term265047, term265047.getClass(), "totalExpertSync", -402209834);
        setIntField(term265047, term265047.getClass(), "totalMasterSync", -1641289658);
        setIntField(term265047, term265047.getClass(), "totalReMasterSync", 2014093797);
        setLongField(term265047, term265047.getClass(), "totalAchievement", 1083206868616667634L);
        setLongField(term265047, term265047.getClass(), "totalBasicAchievement", 1235115449997449326L);
        setLongField(term265047, term265047.getClass(), "totalAdvancedAchievement", 1145114767481539662L);
        setLongField(term265047, term265047.getClass(), "totalExpertAchievement", -6414532060545105249L);
        setLongField(term265047, term265047.getClass(), "totalMasterAchievement", 5133996666025986534L);
        setLongField(term265047, term265047.getClass(), "totalReMasterAchievement", -7896098173261351418L);
        setLongField(term265047, term265047.getClass(), "playerOldRating", 1094798158959312513L);
        setLongField(term265047, term265047.getClass(), "playerNewRating", 2001123814972566842L);
        setIntField(term265047, term265047.getClass(), "banState", -556201841);
        setLongField(term265047, term265047.getClass(), "dateTime", 725802133371329566L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tObTOEkwsm";
        callMethod(klass, "setCompatibleCmVersion", argTypes, term265047, args);
    }

};


