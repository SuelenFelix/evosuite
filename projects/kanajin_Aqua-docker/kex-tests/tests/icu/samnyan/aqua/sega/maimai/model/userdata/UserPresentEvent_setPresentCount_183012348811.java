package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserPresentEvent_setPresentCount_183012348811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99873;
     Object term100053;

    public UserPresentEvent_setPresentCount_183012348811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99879 = new Long(-187772971269812453L);
        term99873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term99875 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term99877 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99908 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99873, term99873.getClass(), "id", -671374290989371865L);
        setLongField(term99875, term99875.getClass(), "id", -344973543098043088L);
        setLongField(term99877, term99877.getClass(), "id", -8743015685701431890L);
        setField(term99877, term99877.getClass(), "extId", term99879);
        setField(term99877, term99877.getClass(), "luid", "cmIDVqeLNI");
        setIntField(term99894, term99894.getClass(), "year", 2018);
        setShortField(term99894, term99894.getClass(), "month", (short) 1);
        setShortField(term99894, term99894.getClass(), "day", (short) 24);
        setField(term99893, term99893.getClass(), "date", term99894);
        setByteField(term99898, term99898.getClass(), "hour", (byte) 11);
        setByteField(term99898, term99898.getClass(), "minute", (byte) 50);
        setByteField(term99898, term99898.getClass(), "second", (byte) 41);
        setIntField(term99898, term99898.getClass(), "nano", 402572098);
        setField(term99893, term99893.getClass(), "time", term99898);
        setField(term99877, term99877.getClass(), "registerTime", term99893);
        setIntField(term99904, term99904.getClass(), "year", 2021);
        setShortField(term99904, term99904.getClass(), "month", (short) 11);
        setShortField(term99904, term99904.getClass(), "day", (short) 14);
        setField(term99903, term99903.getClass(), "date", term99904);
        setByteField(term99908, term99908.getClass(), "hour", (byte) 3);
        setByteField(term99908, term99908.getClass(), "minute", (byte) 30);
        setByteField(term99908, term99908.getClass(), "second", (byte) 36);
        setIntField(term99908, term99908.getClass(), "nano", 680228713);
        setField(term99903, term99903.getClass(), "time", term99908);
        setField(term99877, term99877.getClass(), "accessTime", term99903);
        setField(term99875, term99875.getClass(), "card", term99877);
        setIntField(term99875, term99875.getClass(), "lastDataVersion", -199507260);
        setField(term99875, term99875.getClass(), "userName", "XoYlWxsjIF");
        setIntField(term99875, term99875.getClass(), "point", 279510269);
        setIntField(term99875, term99875.getClass(), "totalPoint", 1637234291);
        setIntField(term99875, term99875.getClass(), "iconId", -653743992);
        setIntField(term99875, term99875.getClass(), "nameplateId", 202545148);
        setIntField(term99875, term99875.getClass(), "frameId", 1455433906);
        setIntField(term99875, term99875.getClass(), "trophyId", -503364604);
        setIntField(term99875, term99875.getClass(), "playCount", -940394359);
        setIntField(term99875, term99875.getClass(), "playVsCount", 1125467468);
        setIntField(term99875, term99875.getClass(), "playSyncCount", 2062219450);
        setIntField(term99875, term99875.getClass(), "winCount", 1267978887);
        setIntField(term99875, term99875.getClass(), "helpCount", 1628831213);
        setIntField(term99875, term99875.getClass(), "comboCount", -2028140041);
        setIntField(term99875, term99875.getClass(), "feverCount", 1579670901);
        setIntField(term99875, term99875.getClass(), "totalHiScore", -1040250853);
        setIntField(term99875, term99875.getClass(), "totalEasyHighScore", 311680987);
        setIntField(term99875, term99875.getClass(), "totalBasicHighScore", 2086480897);
        setIntField(term99875, term99875.getClass(), "totalAdvancedHighScore", 774843738);
        setIntField(term99875, term99875.getClass(), "totalExpertHighScore", 49558267);
        setIntField(term99875, term99875.getClass(), "totalMasterHighScore", -1973293496);
        setIntField(term99875, term99875.getClass(), "totalReMasterHighScore", 1252695742);
        setIntField(term99875, term99875.getClass(), "totalHighSync", -491910666);
        setIntField(term99875, term99875.getClass(), "totalEasySync", 968090679);
        setIntField(term99875, term99875.getClass(), "totalBasicSync", 300152987);
        setIntField(term99875, term99875.getClass(), "totalAdvancedSync", 631176869);
        setIntField(term99875, term99875.getClass(), "totalExpertSync", -1579413196);
        setIntField(term99875, term99875.getClass(), "totalMasterSync", -1296334425);
        setIntField(term99875, term99875.getClass(), "totalReMasterSync", -239179118);
        setIntField(term99875, term99875.getClass(), "playerRating", 651097705);
        setIntField(term99875, term99875.getClass(), "highestRating", 249847519);
        setIntField(term99875, term99875.getClass(), "rankAuthTailId", 1938260764);
        setField(term99875, term99875.getClass(), "eventWatchedDate", "xkIacuRHpE");
        setField(term99875, term99875.getClass(), "webLimitDate", "xFULXQCABK");
        setIntField(term99875, term99875.getClass(), "challengeTrackPhase", 376902502);
        setIntField(term99875, term99875.getClass(), "firstPlayBits", -1504091830);
        setField(term99875, term99875.getClass(), "lastPlayDate", "ONotPjASxK");
        setIntField(term99875, term99875.getClass(), "lastPlaceId", 354329189);
        setField(term99875, term99875.getClass(), "lastPlaceName", "LzgtTgYOFG");
        setIntField(term99875, term99875.getClass(), "lastRegionId", 337628887);
        setField(term99875, term99875.getClass(), "lastRegionName", "ouCBOakoEl");
        setField(term99875, term99875.getClass(), "lastClientId", "wQVWUCbSgW");
        setField(term99875, term99875.getClass(), "lastCountryCode", "tHzdWkkvkE");
        setIntField(term99875, term99875.getClass(), "eventPoint", -1623672019);
        setIntField(term99875, term99875.getClass(), "totalLv", 748011175);
        setIntField(term99875, term99875.getClass(), "lastLoginBonusDay", 1872579805);
        setIntField(term99875, term99875.getClass(), "lastSurvivalBonusDay", 396945726);
        setIntField(term99875, term99875.getClass(), "loginBonusLv", 376449663);
        setField(term99873, term99873.getClass(), "user", term99875);
        setIntField(term99873, term99873.getClass(), "presentEventId", -453129512);
        setIntField(term99873, term99873.getClass(), "point", 828513099);
        setIntField(term99873, term99873.getClass(), "presentCount", -1918112820);
        setIntField(term99873, term99873.getClass(), "rate", 104826972);
        term100053 = new Integer(-1076408006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100053;
        callMethod(klass, "setPresentCount", argTypes, term99873, args);
    }

};


