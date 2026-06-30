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

public class UserDetail_setLastSelectEMoney_137755853114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4294497;
     Object term4294852;

    public UserDetail_setLastSelectEMoney_137755853114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4294501 = new Long(5609222796474002227L);
        Integer term4294564 = new Integer(-1485210649);
        Integer term4294566 = new Integer(343270861);
        Integer term4294568 = new Integer(408001246);
        Integer term4294570 = new Integer(-413564129);
        ArrayList term4294562 = new ArrayList();
        ((ArrayList) term4294562).add(term4294564);
        ((ArrayList) term4294562).add(term4294566);
        ((ArrayList) term4294562).add(term4294568);
        ((ArrayList) term4294562).add(term4294570);
        Integer term4294576 = new Integer(-32548606);
        Integer term4294578 = new Integer(129009378);
        Integer term4294580 = new Integer(1817148676);
        Integer term4294582 = new Integer(1276665124);
        ArrayList term4294574 = new ArrayList();
        ((ArrayList) term4294574).add(term4294576);
        ((ArrayList) term4294574).add(term4294578);
        ((ArrayList) term4294574).add(term4294580);
        ((ArrayList) term4294574).add(term4294582);
        term4294497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4294499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4294515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4294516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4294520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4294525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4294526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4294530 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4294497, term4294497.getClass(), "id", -5566806743834617697L);
        setLongField(term4294499, term4294499.getClass(), "id", 1935720069096875641L);
        setField(term4294499, term4294499.getClass(), "extId", term4294501);
        setField(term4294499, term4294499.getClass(), "luid", "wsoUJwCQAF");
        setIntField(term4294516, term4294516.getClass(), "year", 2018);
        setShortField(term4294516, term4294516.getClass(), "month", (short) 7);
        setShortField(term4294516, term4294516.getClass(), "day", (short) 28);
        setField(term4294515, term4294515.getClass(), "date", term4294516);
        setByteField(term4294520, term4294520.getClass(), "hour", (byte) 23);
        setByteField(term4294520, term4294520.getClass(), "minute", (byte) 33);
        setByteField(term4294520, term4294520.getClass(), "second", (byte) 59);
        setIntField(term4294520, term4294520.getClass(), "nano", 118151816);
        setField(term4294515, term4294515.getClass(), "time", term4294520);
        setField(term4294499, term4294499.getClass(), "registerTime", term4294515);
        setIntField(term4294526, term4294526.getClass(), "year", 2015);
        setShortField(term4294526, term4294526.getClass(), "month", (short) 1);
        setShortField(term4294526, term4294526.getClass(), "day", (short) 14);
        setField(term4294525, term4294525.getClass(), "date", term4294526);
        setByteField(term4294530, term4294530.getClass(), "hour", (byte) 11);
        setByteField(term4294530, term4294530.getClass(), "minute", (byte) 11);
        setByteField(term4294530, term4294530.getClass(), "second", (byte) 2);
        setIntField(term4294530, term4294530.getClass(), "nano", 203150625);
        setField(term4294525, term4294525.getClass(), "time", term4294530);
        setField(term4294499, term4294499.getClass(), "accessTime", term4294525);
        setField(term4294497, term4294497.getClass(), "card", term4294499);
        setField(term4294497, term4294497.getClass(), "userName", "TjaCfIVyod");
        setIntField(term4294497, term4294497.getClass(), "isNetMember", 861316392);
        setIntField(term4294497, term4294497.getClass(), "iconId", 713095470);
        setIntField(term4294497, term4294497.getClass(), "plateId", 337580834);
        setIntField(term4294497, term4294497.getClass(), "titleId", -1034172112);
        setIntField(term4294497, term4294497.getClass(), "partnerId", 1521697872);
        setIntField(term4294497, term4294497.getClass(), "frameId", 1362377282);
        setIntField(term4294497, term4294497.getClass(), "selectMapId", -1469708442);
        setIntField(term4294497, term4294497.getClass(), "totalAwake", 1171717300);
        setIntField(term4294497, term4294497.getClass(), "gradeRating", -1227332012);
        setIntField(term4294497, term4294497.getClass(), "musicRating", 1352333757);
        setIntField(term4294497, term4294497.getClass(), "playerRating", -1151501995);
        setIntField(term4294497, term4294497.getClass(), "highestRating", 803660123);
        setIntField(term4294497, term4294497.getClass(), "gradeRank", -1428768501);
        setIntField(term4294497, term4294497.getClass(), "classRank", -1061205156);
        setIntField(term4294497, term4294497.getClass(), "courseRank", 1775410082);
        setField(term4294497, term4294497.getClass(), "charaSlot", term4294562);
        setField(term4294497, term4294497.getClass(), "charaLockSlot", term4294574);
        setLongField(term4294497, term4294497.getClass(), "contentBit", 1627959792388411383L);
        setIntField(term4294497, term4294497.getClass(), "playCount", -1393001746);
        setField(term4294497, term4294497.getClass(), "eventWatchedDate", "RWqCcalaUm");
        setField(term4294497, term4294497.getClass(), "lastGameId", "kWLQMVBTWV");
        setField(term4294497, term4294497.getClass(), "lastRomVersion", "vYWfjltZRL");
        setField(term4294497, term4294497.getClass(), "lastDataVersion", "KtlwlfuaoW");
        setField(term4294497, term4294497.getClass(), "lastLoginDate", "fUYvFyQyuB");
        setField(term4294497, term4294497.getClass(), "lastPlayDate", "FytuDrGLbQ");
        setIntField(term4294497, term4294497.getClass(), "lastPlayCredit", -1012237240);
        setIntField(term4294497, term4294497.getClass(), "lastPlayMode", 1832855128);
        setIntField(term4294497, term4294497.getClass(), "lastPlaceId", -1659022966);
        setField(term4294497, term4294497.getClass(), "lastPlaceName", "pUmHPLxGlT");
        setIntField(term4294497, term4294497.getClass(), "lastAllNetId", 450617564);
        setIntField(term4294497, term4294497.getClass(), "lastRegionId", 1678761547);
        setField(term4294497, term4294497.getClass(), "lastRegionName", "zMCfxAEDdq");
        setField(term4294497, term4294497.getClass(), "lastClientId", "TufXCiZQrl");
        setField(term4294497, term4294497.getClass(), "lastCountryCode", "FYxBpfQHqy");
        setIntField(term4294497, term4294497.getClass(), "lastSelectEMoney", 481819335);
        setIntField(term4294497, term4294497.getClass(), "lastSelectTicket", 207004272);
        setIntField(term4294497, term4294497.getClass(), "lastSelectCourse", 1564109884);
        setIntField(term4294497, term4294497.getClass(), "lastCountCourse", -874763398);
        setField(term4294497, term4294497.getClass(), "firstGameId", "GxmoWxRAGW");
        setField(term4294497, term4294497.getClass(), "firstRomVersion", "zetVVQvzFx");
        setField(term4294497, term4294497.getClass(), "firstDataVersion", "tHEZKPisJr");
        setField(term4294497, term4294497.getClass(), "firstPlayDate", "BREgEnNQDL");
        setField(term4294497, term4294497.getClass(), "compatibleCmVersion", "bLZxRoplLC");
        setField(term4294497, term4294497.getClass(), "dailyBonusDate", "GLuhifztGK");
        setField(term4294497, term4294497.getClass(), "dailyCourseBonusDate", "QUdGkRyhIJ");
        setField(term4294497, term4294497.getClass(), "lastPairLoginDate", "PxKjwARthT");
        setField(term4294497, term4294497.getClass(), "lastTrialPlayDate", "LtKNluJKhD");
        setIntField(term4294497, term4294497.getClass(), "playVsCount", -460605118);
        setIntField(term4294497, term4294497.getClass(), "playSyncCount", 793399976);
        setIntField(term4294497, term4294497.getClass(), "winCount", 422789650);
        setIntField(term4294497, term4294497.getClass(), "helpCount", -1936865967);
        setIntField(term4294497, term4294497.getClass(), "comboCount", 1660694726);
        setLongField(term4294497, term4294497.getClass(), "totalDeluxscore", 7869462745080132744L);
        setLongField(term4294497, term4294497.getClass(), "totalBasicDeluxscore", -6514067071337459242L);
        setLongField(term4294497, term4294497.getClass(), "totalAdvancedDeluxscore", 4439278560158628857L);
        setLongField(term4294497, term4294497.getClass(), "totalExpertDeluxscore", 975875267058716191L);
        setLongField(term4294497, term4294497.getClass(), "totalMasterDeluxscore", -7316513955960984691L);
        setLongField(term4294497, term4294497.getClass(), "totalReMasterDeluxscore", 1051919453785468704L);
        setIntField(term4294497, term4294497.getClass(), "totalSync", -660032110);
        setIntField(term4294497, term4294497.getClass(), "totalBasicSync", 566214096);
        setIntField(term4294497, term4294497.getClass(), "totalAdvancedSync", -1854925675);
        setIntField(term4294497, term4294497.getClass(), "totalExpertSync", -503060769);
        setIntField(term4294497, term4294497.getClass(), "totalMasterSync", 1471876331);
        setIntField(term4294497, term4294497.getClass(), "totalReMasterSync", -1735032800);
        setLongField(term4294497, term4294497.getClass(), "totalAchievement", 2693809309554358203L);
        setLongField(term4294497, term4294497.getClass(), "totalBasicAchievement", -3717657111413691844L);
        setLongField(term4294497, term4294497.getClass(), "totalAdvancedAchievement", 6739232408682943991L);
        setLongField(term4294497, term4294497.getClass(), "totalExpertAchievement", 1135214018272360137L);
        setLongField(term4294497, term4294497.getClass(), "totalMasterAchievement", 6575727369878022199L);
        setLongField(term4294497, term4294497.getClass(), "totalReMasterAchievement", -6943753892097519813L);
        setLongField(term4294497, term4294497.getClass(), "playerOldRating", 5484059816116690098L);
        setLongField(term4294497, term4294497.getClass(), "playerNewRating", 4499818717200228481L);
        setIntField(term4294497, term4294497.getClass(), "banState", -842011953);
        setLongField(term4294497, term4294497.getClass(), "dateTime", 2708623580098119146L);
        term4294852 = new Integer(35769858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4294852;
        callMethod(klass, "setLastSelectEMoney", argTypes, term4294497, args);
    }

};


