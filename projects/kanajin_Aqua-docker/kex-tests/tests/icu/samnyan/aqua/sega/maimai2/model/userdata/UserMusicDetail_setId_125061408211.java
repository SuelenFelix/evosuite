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

public class UserMusicDetail_setId_125061408211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61324;
     Object term61681;

    public UserMusicDetail_setId_125061408211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61330 = new Long(-8085190702504231560L);
        Integer term61393 = new Integer(1822317628);
        Integer term61395 = new Integer(-608830309);
        ArrayList term61391 = new ArrayList();
        ((ArrayList) term61391).add(term61393);
        ((ArrayList) term61391).add(term61395);
        Integer term61401 = new Integer(-537786484);
        Integer term61403 = new Integer(263859424);
        ArrayList term61399 = new ArrayList();
        ((ArrayList) term61399).add(term61401);
        ((ArrayList) term61399).add(term61403);
        term61324 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term61326 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term61328 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61359 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61324, term61324.getClass(), "id", 6024204865305504328L);
        setLongField(term61326, term61326.getClass(), "id", 2554027544370354047L);
        setLongField(term61328, term61328.getClass(), "id", 365411533450462757L);
        setField(term61328, term61328.getClass(), "extId", term61330);
        setField(term61328, term61328.getClass(), "luid", "IcbBNUXJqX");
        setIntField(term61345, term61345.getClass(), "year", 2021);
        setShortField(term61345, term61345.getClass(), "month", (short) 12);
        setShortField(term61345, term61345.getClass(), "day", (short) 23);
        setField(term61344, term61344.getClass(), "date", term61345);
        setByteField(term61349, term61349.getClass(), "hour", (byte) 18);
        setByteField(term61349, term61349.getClass(), "minute", (byte) 52);
        setByteField(term61349, term61349.getClass(), "second", (byte) 27);
        setIntField(term61349, term61349.getClass(), "nano", 512484524);
        setField(term61344, term61344.getClass(), "time", term61349);
        setField(term61328, term61328.getClass(), "registerTime", term61344);
        setIntField(term61355, term61355.getClass(), "year", 2012);
        setShortField(term61355, term61355.getClass(), "month", (short) 6);
        setShortField(term61355, term61355.getClass(), "day", (short) 25);
        setField(term61354, term61354.getClass(), "date", term61355);
        setByteField(term61359, term61359.getClass(), "hour", (byte) 2);
        setByteField(term61359, term61359.getClass(), "minute", (byte) 21);
        setByteField(term61359, term61359.getClass(), "second", (byte) 28);
        setIntField(term61359, term61359.getClass(), "nano", 605177282);
        setField(term61354, term61354.getClass(), "time", term61359);
        setField(term61328, term61328.getClass(), "accessTime", term61354);
        setField(term61326, term61326.getClass(), "card", term61328);
        setField(term61326, term61326.getClass(), "userName", "LONFjqAsUp");
        setIntField(term61326, term61326.getClass(), "isNetMember", -738503746);
        setIntField(term61326, term61326.getClass(), "iconId", 1118865267);
        setIntField(term61326, term61326.getClass(), "plateId", 1899392740);
        setIntField(term61326, term61326.getClass(), "titleId", 144291847);
        setIntField(term61326, term61326.getClass(), "partnerId", 263154490);
        setIntField(term61326, term61326.getClass(), "frameId", 1685033038);
        setIntField(term61326, term61326.getClass(), "selectMapId", 1455872685);
        setIntField(term61326, term61326.getClass(), "totalAwake", -895803070);
        setIntField(term61326, term61326.getClass(), "gradeRating", -2065313027);
        setIntField(term61326, term61326.getClass(), "musicRating", 394881188);
        setIntField(term61326, term61326.getClass(), "playerRating", 2114133243);
        setIntField(term61326, term61326.getClass(), "highestRating", -1108430202);
        setIntField(term61326, term61326.getClass(), "gradeRank", 972569482);
        setIntField(term61326, term61326.getClass(), "classRank", -924513639);
        setIntField(term61326, term61326.getClass(), "courseRank", -1763498118);
        setField(term61326, term61326.getClass(), "charaSlot", term61391);
        setField(term61326, term61326.getClass(), "charaLockSlot", term61399);
        setLongField(term61326, term61326.getClass(), "contentBit", -5876369379613954614L);
        setIntField(term61326, term61326.getClass(), "playCount", -1084106934);
        setField(term61326, term61326.getClass(), "eventWatchedDate", "tAhydlbSMf");
        setField(term61326, term61326.getClass(), "lastGameId", "wNYtcPFyIe");
        setField(term61326, term61326.getClass(), "lastRomVersion", "tlIqgTUSQw");
        setField(term61326, term61326.getClass(), "lastDataVersion", "UvweyXjDhG");
        setField(term61326, term61326.getClass(), "lastLoginDate", "wnoVhNwdJy");
        setField(term61326, term61326.getClass(), "lastPlayDate", "uQGMBLrmAj");
        setIntField(term61326, term61326.getClass(), "lastPlayCredit", -1137769039);
        setIntField(term61326, term61326.getClass(), "lastPlayMode", 753769464);
        setIntField(term61326, term61326.getClass(), "lastPlaceId", -2025824446);
        setField(term61326, term61326.getClass(), "lastPlaceName", "vNFaheDeBv");
        setIntField(term61326, term61326.getClass(), "lastAllNetId", -203123521);
        setIntField(term61326, term61326.getClass(), "lastRegionId", 2107969370);
        setField(term61326, term61326.getClass(), "lastRegionName", "CiPMRxGoHO");
        setField(term61326, term61326.getClass(), "lastClientId", "LauKpKmenw");
        setField(term61326, term61326.getClass(), "lastCountryCode", "TydzbTXvbY");
        setIntField(term61326, term61326.getClass(), "lastSelectEMoney", -1606896209);
        setIntField(term61326, term61326.getClass(), "lastSelectTicket", 1824801079);
        setIntField(term61326, term61326.getClass(), "lastSelectCourse", 1191665770);
        setIntField(term61326, term61326.getClass(), "lastCountCourse", -401274751);
        setField(term61326, term61326.getClass(), "firstGameId", "yNogNNecFu");
        setField(term61326, term61326.getClass(), "firstRomVersion", "tcaaotqgDF");
        setField(term61326, term61326.getClass(), "firstDataVersion", "bXInWdOeyi");
        setField(term61326, term61326.getClass(), "firstPlayDate", "HdwopulXkf");
        setField(term61326, term61326.getClass(), "compatibleCmVersion", "FuCKfgAhpC");
        setField(term61326, term61326.getClass(), "dailyBonusDate", "gqMysJhxfA");
        setField(term61326, term61326.getClass(), "dailyCourseBonusDate", "HtLEppUqzI");
        setField(term61326, term61326.getClass(), "lastPairLoginDate", "bVlRrMQeRY");
        setField(term61326, term61326.getClass(), "lastTrialPlayDate", "SXaXhlzAIB");
        setIntField(term61326, term61326.getClass(), "playVsCount", 2063937149);
        setIntField(term61326, term61326.getClass(), "playSyncCount", 166881458);
        setIntField(term61326, term61326.getClass(), "winCount", 828853234);
        setIntField(term61326, term61326.getClass(), "helpCount", 1203278976);
        setIntField(term61326, term61326.getClass(), "comboCount", 751787241);
        setLongField(term61326, term61326.getClass(), "totalDeluxscore", 9069442033463962750L);
        setLongField(term61326, term61326.getClass(), "totalBasicDeluxscore", 3575561499505653094L);
        setLongField(term61326, term61326.getClass(), "totalAdvancedDeluxscore", -4244720445894600013L);
        setLongField(term61326, term61326.getClass(), "totalExpertDeluxscore", 523156443226992560L);
        setLongField(term61326, term61326.getClass(), "totalMasterDeluxscore", 2239859681808970691L);
        setLongField(term61326, term61326.getClass(), "totalReMasterDeluxscore", -4502190204332677735L);
        setIntField(term61326, term61326.getClass(), "totalSync", 477748320);
        setIntField(term61326, term61326.getClass(), "totalBasicSync", 512793147);
        setIntField(term61326, term61326.getClass(), "totalAdvancedSync", -2061386860);
        setIntField(term61326, term61326.getClass(), "totalExpertSync", -678230923);
        setIntField(term61326, term61326.getClass(), "totalMasterSync", 2001978730);
        setIntField(term61326, term61326.getClass(), "totalReMasterSync", 835522995);
        setLongField(term61326, term61326.getClass(), "totalAchievement", 4165201970048882126L);
        setLongField(term61326, term61326.getClass(), "totalBasicAchievement", 1713132989163348687L);
        setLongField(term61326, term61326.getClass(), "totalAdvancedAchievement", 4782360695691953108L);
        setLongField(term61326, term61326.getClass(), "totalExpertAchievement", 5499210513338318618L);
        setLongField(term61326, term61326.getClass(), "totalMasterAchievement", 4904841436380882882L);
        setLongField(term61326, term61326.getClass(), "totalReMasterAchievement", 4601901314293570056L);
        setLongField(term61326, term61326.getClass(), "playerOldRating", 3811147117668167855L);
        setLongField(term61326, term61326.getClass(), "playerNewRating", -5397349204553241395L);
        setIntField(term61326, term61326.getClass(), "banState", 209416345);
        setLongField(term61326, term61326.getClass(), "dateTime", -5533270660427460254L);
        setField(term61324, term61324.getClass(), "user", term61326);
        setIntField(term61324, term61324.getClass(), "musicId", 119693843);
        setIntField(term61324, term61324.getClass(), "level", 1525937366);
        setIntField(term61324, term61324.getClass(), "playCount", 450142186);
        setIntField(term61324, term61324.getClass(), "achievement", 874917656);
        setIntField(term61324, term61324.getClass(), "comboStatus", 998050776);
        setIntField(term61324, term61324.getClass(), "syncStatus", -1154360532);
        setIntField(term61324, term61324.getClass(), "deluxscoreMax", -1414782360);
        setIntField(term61324, term61324.getClass(), "scoreRank", 812774787);
        term61681 = new Long(6870806673850570339L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term61681;
        callMethod(klass, "setId", argTypes, term61324, args);
    }

};


