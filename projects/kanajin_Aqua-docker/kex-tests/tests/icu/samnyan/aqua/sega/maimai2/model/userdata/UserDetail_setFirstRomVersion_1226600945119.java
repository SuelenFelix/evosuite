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

public class UserDetail_setFirstRomVersion_1226600945119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4297356;

    public UserDetail_setFirstRomVersion_1226600945119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4297360 = new Long(349006973694791230L);
        Integer term4297423 = new Integer(103420135);
        Integer term4297425 = new Integer(998281573);
        Integer term4297427 = new Integer(1538565026);
        Integer term4297429 = new Integer(1510446613);
        Integer term4297431 = new Integer(-591217691);
        Integer term4297433 = new Integer(-1436479682);
        Integer term4297435 = new Integer(-87850160);
        Integer term4297437 = new Integer(2100422614);
        ArrayList term4297421 = new ArrayList();
        ((ArrayList) term4297421).add(term4297423);
        ((ArrayList) term4297421).add(term4297425);
        ((ArrayList) term4297421).add(term4297427);
        ((ArrayList) term4297421).add(term4297429);
        ((ArrayList) term4297421).add(term4297431);
        ((ArrayList) term4297421).add(term4297433);
        ((ArrayList) term4297421).add(term4297435);
        ((ArrayList) term4297421).add(term4297437);
        Integer term4297443 = new Integer(95434101);
        Integer term4297445 = new Integer(1578254763);
        Integer term4297447 = new Integer(-1197972603);
        Integer term4297449 = new Integer(82035733);
        Integer term4297451 = new Integer(-815104311);
        Integer term4297453 = new Integer(-323574733);
        Integer term4297455 = new Integer(-1600567927);
        ArrayList term4297441 = new ArrayList();
        ((ArrayList) term4297441).add(term4297443);
        ((ArrayList) term4297441).add(term4297445);
        ((ArrayList) term4297441).add(term4297447);
        ((ArrayList) term4297441).add(term4297449);
        ((ArrayList) term4297441).add(term4297451);
        ((ArrayList) term4297441).add(term4297453);
        ((ArrayList) term4297441).add(term4297455);
        term4297356 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4297358 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4297374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4297375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4297379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4297384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4297385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4297389 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4297356, term4297356.getClass(), "id", -3907988790496905866L);
        setLongField(term4297358, term4297358.getClass(), "id", 7910609399987140071L);
        setField(term4297358, term4297358.getClass(), "extId", term4297360);
        setField(term4297358, term4297358.getClass(), "luid", "IkGhGBYZZM");
        setIntField(term4297375, term4297375.getClass(), "year", 2026);
        setShortField(term4297375, term4297375.getClass(), "month", (short) 6);
        setShortField(term4297375, term4297375.getClass(), "day", (short) 29);
        setField(term4297374, term4297374.getClass(), "date", term4297375);
        setByteField(term4297379, term4297379.getClass(), "hour", (byte) 9);
        setByteField(term4297379, term4297379.getClass(), "minute", (byte) 42);
        setByteField(term4297379, term4297379.getClass(), "second", (byte) 40);
        setIntField(term4297379, term4297379.getClass(), "nano", 369251952);
        setField(term4297374, term4297374.getClass(), "time", term4297379);
        setField(term4297358, term4297358.getClass(), "registerTime", term4297374);
        setIntField(term4297385, term4297385.getClass(), "year", 2026);
        setShortField(term4297385, term4297385.getClass(), "month", (short) 12);
        setShortField(term4297385, term4297385.getClass(), "day", (short) 12);
        setField(term4297384, term4297384.getClass(), "date", term4297385);
        setByteField(term4297389, term4297389.getClass(), "hour", (byte) 21);
        setByteField(term4297389, term4297389.getClass(), "minute", (byte) 40);
        setByteField(term4297389, term4297389.getClass(), "second", (byte) 37);
        setIntField(term4297389, term4297389.getClass(), "nano", 388086847);
        setField(term4297384, term4297384.getClass(), "time", term4297389);
        setField(term4297358, term4297358.getClass(), "accessTime", term4297384);
        setField(term4297356, term4297356.getClass(), "card", term4297358);
        setField(term4297356, term4297356.getClass(), "userName", "TesylcGhAg");
        setIntField(term4297356, term4297356.getClass(), "isNetMember", 232776669);
        setIntField(term4297356, term4297356.getClass(), "iconId", 164175364);
        setIntField(term4297356, term4297356.getClass(), "plateId", 596627551);
        setIntField(term4297356, term4297356.getClass(), "titleId", 1275292879);
        setIntField(term4297356, term4297356.getClass(), "partnerId", -1174000517);
        setIntField(term4297356, term4297356.getClass(), "frameId", 225275239);
        setIntField(term4297356, term4297356.getClass(), "selectMapId", 1312334219);
        setIntField(term4297356, term4297356.getClass(), "totalAwake", -5823355);
        setIntField(term4297356, term4297356.getClass(), "gradeRating", -1296070448);
        setIntField(term4297356, term4297356.getClass(), "musicRating", 1328119077);
        setIntField(term4297356, term4297356.getClass(), "playerRating", -1474687691);
        setIntField(term4297356, term4297356.getClass(), "highestRating", -1117663049);
        setIntField(term4297356, term4297356.getClass(), "gradeRank", -663925999);
        setIntField(term4297356, term4297356.getClass(), "classRank", -1944395116);
        setIntField(term4297356, term4297356.getClass(), "courseRank", -1459466508);
        setField(term4297356, term4297356.getClass(), "charaSlot", term4297421);
        setField(term4297356, term4297356.getClass(), "charaLockSlot", term4297441);
        setLongField(term4297356, term4297356.getClass(), "contentBit", 1319452095526096425L);
        setIntField(term4297356, term4297356.getClass(), "playCount", 1661632888);
        setField(term4297356, term4297356.getClass(), "eventWatchedDate", "UIBEAbAJCK");
        setField(term4297356, term4297356.getClass(), "lastGameId", "ihGrigeMlq");
        setField(term4297356, term4297356.getClass(), "lastRomVersion", "VfqaZcqCOx");
        setField(term4297356, term4297356.getClass(), "lastDataVersion", "JYNRdbgQeT");
        setField(term4297356, term4297356.getClass(), "lastLoginDate", "DIMeoVymUp");
        setField(term4297356, term4297356.getClass(), "lastPlayDate", "pQLChjuOuj");
        setIntField(term4297356, term4297356.getClass(), "lastPlayCredit", -584891769);
        setIntField(term4297356, term4297356.getClass(), "lastPlayMode", 46363394);
        setIntField(term4297356, term4297356.getClass(), "lastPlaceId", 1362087678);
        setField(term4297356, term4297356.getClass(), "lastPlaceName", "sCneqwMoRb");
        setIntField(term4297356, term4297356.getClass(), "lastAllNetId", 160317589);
        setIntField(term4297356, term4297356.getClass(), "lastRegionId", 869125814);
        setField(term4297356, term4297356.getClass(), "lastRegionName", "nnSwPjkBwo");
        setField(term4297356, term4297356.getClass(), "lastClientId", "KviiLpMlkt");
        setField(term4297356, term4297356.getClass(), "lastCountryCode", "cNdfXJBJfU");
        setIntField(term4297356, term4297356.getClass(), "lastSelectEMoney", 1486995978);
        setIntField(term4297356, term4297356.getClass(), "lastSelectTicket", 976118766);
        setIntField(term4297356, term4297356.getClass(), "lastSelectCourse", -1796527603);
        setIntField(term4297356, term4297356.getClass(), "lastCountCourse", 419659969);
        setField(term4297356, term4297356.getClass(), "firstGameId", "BXijECybAp");
        setField(term4297356, term4297356.getClass(), "firstRomVersion", "qubXcZYALY");
        setField(term4297356, term4297356.getClass(), "firstDataVersion", "fwpNSmXryW");
        setField(term4297356, term4297356.getClass(), "firstPlayDate", "KDdFnOgDKv");
        setField(term4297356, term4297356.getClass(), "compatibleCmVersion", "lzCQwLtIAS");
        setField(term4297356, term4297356.getClass(), "dailyBonusDate", "XQtXVGNdxr");
        setField(term4297356, term4297356.getClass(), "dailyCourseBonusDate", "wNJcNxuYqi");
        setField(term4297356, term4297356.getClass(), "lastPairLoginDate", "iSDQOzoGWA");
        setField(term4297356, term4297356.getClass(), "lastTrialPlayDate", "dZPskHEAHl");
        setIntField(term4297356, term4297356.getClass(), "playVsCount", 849522985);
        setIntField(term4297356, term4297356.getClass(), "playSyncCount", 983592136);
        setIntField(term4297356, term4297356.getClass(), "winCount", -1847584831);
        setIntField(term4297356, term4297356.getClass(), "helpCount", 755298060);
        setIntField(term4297356, term4297356.getClass(), "comboCount", -228334448);
        setLongField(term4297356, term4297356.getClass(), "totalDeluxscore", 8030378538929813590L);
        setLongField(term4297356, term4297356.getClass(), "totalBasicDeluxscore", 9006327564260918155L);
        setLongField(term4297356, term4297356.getClass(), "totalAdvancedDeluxscore", -5714338657941902755L);
        setLongField(term4297356, term4297356.getClass(), "totalExpertDeluxscore", 2194287265609531541L);
        setLongField(term4297356, term4297356.getClass(), "totalMasterDeluxscore", -6747674956378278763L);
        setLongField(term4297356, term4297356.getClass(), "totalReMasterDeluxscore", -4291100745475474682L);
        setIntField(term4297356, term4297356.getClass(), "totalSync", 1005651769);
        setIntField(term4297356, term4297356.getClass(), "totalBasicSync", 1312740455);
        setIntField(term4297356, term4297356.getClass(), "totalAdvancedSync", 963878691);
        setIntField(term4297356, term4297356.getClass(), "totalExpertSync", -1855442629);
        setIntField(term4297356, term4297356.getClass(), "totalMasterSync", 2096948770);
        setIntField(term4297356, term4297356.getClass(), "totalReMasterSync", 624560580);
        setLongField(term4297356, term4297356.getClass(), "totalAchievement", -3057242938276315192L);
        setLongField(term4297356, term4297356.getClass(), "totalBasicAchievement", 2264832363858736447L);
        setLongField(term4297356, term4297356.getClass(), "totalAdvancedAchievement", -2372753447122623636L);
        setLongField(term4297356, term4297356.getClass(), "totalExpertAchievement", -4710050080858064274L);
        setLongField(term4297356, term4297356.getClass(), "totalMasterAchievement", 7899266071694850156L);
        setLongField(term4297356, term4297356.getClass(), "totalReMasterAchievement", 3752071559595456751L);
        setLongField(term4297356, term4297356.getClass(), "playerOldRating", -8980133137637780434L);
        setLongField(term4297356, term4297356.getClass(), "playerNewRating", -5193652464738033938L);
        setIntField(term4297356, term4297356.getClass(), "banState", 1651714522);
        setLongField(term4297356, term4297356.getClass(), "dateTime", 6636651780810846161L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNfeDMxKcx";
        callMethod(klass, "setFirstRomVersion", argTypes, term4297356, args);
    }

};


