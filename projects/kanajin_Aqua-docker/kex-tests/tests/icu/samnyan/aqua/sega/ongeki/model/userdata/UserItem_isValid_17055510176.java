package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_isValid_17055510176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105156;

    public UserItem_isValid_17055510176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105162 = new Long(329213208496958131L);
        term105156 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term105158 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term105160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105156, term105156.getClass(), "id", -3960813943739315753L);
        setLongField(term105158, term105158.getClass(), "id", 2440185930201362993L);
        setLongField(term105160, term105160.getClass(), "id", -6790748395430140318L);
        setField(term105160, term105160.getClass(), "extId", term105162);
        setField(term105160, term105160.getClass(), "luid", "QWnrSwmKgP");
        setIntField(term105177, term105177.getClass(), "year", 2026);
        setShortField(term105177, term105177.getClass(), "month", (short) 4);
        setShortField(term105177, term105177.getClass(), "day", (short) 10);
        setField(term105176, term105176.getClass(), "date", term105177);
        setByteField(term105181, term105181.getClass(), "hour", (byte) 3);
        setByteField(term105181, term105181.getClass(), "minute", (byte) 39);
        setByteField(term105181, term105181.getClass(), "second", (byte) 42);
        setIntField(term105181, term105181.getClass(), "nano", 840728841);
        setField(term105176, term105176.getClass(), "time", term105181);
        setField(term105160, term105160.getClass(), "registerTime", term105176);
        setIntField(term105187, term105187.getClass(), "year", 2029);
        setShortField(term105187, term105187.getClass(), "month", (short) 3);
        setShortField(term105187, term105187.getClass(), "day", (short) 7);
        setField(term105186, term105186.getClass(), "date", term105187);
        setByteField(term105191, term105191.getClass(), "hour", (byte) 11);
        setByteField(term105191, term105191.getClass(), "minute", (byte) 6);
        setByteField(term105191, term105191.getClass(), "second", (byte) 29);
        setIntField(term105191, term105191.getClass(), "nano", 899404417);
        setField(term105186, term105186.getClass(), "time", term105191);
        setField(term105160, term105160.getClass(), "accessTime", term105186);
        setField(term105158, term105158.getClass(), "card", term105160);
        setField(term105158, term105158.getClass(), "userName", "wOeJuAGSwi");
        setIntField(term105158, term105158.getClass(), "level", 412002888);
        setIntField(term105158, term105158.getClass(), "reincarnationNum", -518326317);
        setLongField(term105158, term105158.getClass(), "exp", 8769881600538318027L);
        setLongField(term105158, term105158.getClass(), "point", 3133103815143371243L);
        setLongField(term105158, term105158.getClass(), "totalPoint", -1199652862106814426L);
        setIntField(term105158, term105158.getClass(), "playCount", 638898197);
        setIntField(term105158, term105158.getClass(), "jewelCount", 377212022);
        setIntField(term105158, term105158.getClass(), "totalJewelCount", 1288951867);
        setIntField(term105158, term105158.getClass(), "medalCount", -1878750819);
        setIntField(term105158, term105158.getClass(), "playerRating", 1772604053);
        setIntField(term105158, term105158.getClass(), "highestRating", 704647579);
        setIntField(term105158, term105158.getClass(), "battlePoint", -3495334);
        setIntField(term105158, term105158.getClass(), "bestBattlePoint", 745336129);
        setIntField(term105158, term105158.getClass(), "overDamageBattlePoint", -1700296410);
        setBooleanField(term105158, term105158.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term105158, term105158.getClass(), "nameplateId", -1568191258);
        setIntField(term105158, term105158.getClass(), "trophyId", 1561855050);
        setIntField(term105158, term105158.getClass(), "cardId", -2098601979);
        setIntField(term105158, term105158.getClass(), "characterId", 1900897223);
        setIntField(term105158, term105158.getClass(), "characterVoiceNo", -1269934000);
        setIntField(term105158, term105158.getClass(), "tabSetting", -565153319);
        setIntField(term105158, term105158.getClass(), "tabSortSetting", 769522534);
        setIntField(term105158, term105158.getClass(), "cardCategorySetting", -1587006706);
        setIntField(term105158, term105158.getClass(), "cardSortSetting", -1232437615);
        setIntField(term105158, term105158.getClass(), "rivalScoreCategorySetting", -19383762);
        setIntField(term105158, term105158.getClass(), "playedTutorialBit", 1225890361);
        setIntField(term105158, term105158.getClass(), "firstTutorialCancelNum", 629422211);
        setLongField(term105158, term105158.getClass(), "sumTechHighScore", 6258616282584609602L);
        setLongField(term105158, term105158.getClass(), "sumTechBasicHighScore", -7169750344402266944L);
        setLongField(term105158, term105158.getClass(), "sumTechAdvancedHighScore", 2469102234876835465L);
        setLongField(term105158, term105158.getClass(), "sumTechExpertHighScore", 8757869191630189440L);
        setLongField(term105158, term105158.getClass(), "sumTechMasterHighScore", -1393374527446406666L);
        setLongField(term105158, term105158.getClass(), "sumTechLunaticHighScore", -1485987978753564134L);
        setLongField(term105158, term105158.getClass(), "sumBattleHighScore", 5230084303674835670L);
        setLongField(term105158, term105158.getClass(), "sumBattleBasicHighScore", -1230135382587684425L);
        setLongField(term105158, term105158.getClass(), "sumBattleAdvancedHighScore", 5822337126842986196L);
        setLongField(term105158, term105158.getClass(), "sumBattleExpertHighScore", -895662208563639340L);
        setLongField(term105158, term105158.getClass(), "sumBattleMasterHighScore", 1783736733445461370L);
        setLongField(term105158, term105158.getClass(), "sumBattleLunaticHighScore", 664293159969917289L);
        setField(term105158, term105158.getClass(), "eventWatchedDate", "lCalUsJPRJ");
        setField(term105158, term105158.getClass(), "cmEventWatchedDate", "gFHKkRGUax");
        setField(term105158, term105158.getClass(), "firstGameId", "paZAviFqsm");
        setField(term105158, term105158.getClass(), "firstRomVersion", "GohPpeqrRh");
        setField(term105158, term105158.getClass(), "firstDataVersion", "pfGxZUUbIW");
        setField(term105158, term105158.getClass(), "firstPlayDate", "GhZQSLeLeq");
        setField(term105158, term105158.getClass(), "lastGameId", "vCJwFnMbeg");
        setField(term105158, term105158.getClass(), "lastRomVersion", "HiMyMWtfDT");
        setField(term105158, term105158.getClass(), "lastDataVersion", "bTxfZATYLW");
        setField(term105158, term105158.getClass(), "compatibleCmVersion", "lFWdVTokyG");
        setField(term105158, term105158.getClass(), "lastPlayDate", "PwXoorKXoP");
        setIntField(term105158, term105158.getClass(), "lastPlaceId", 59956966);
        setField(term105158, term105158.getClass(), "lastPlaceName", "FTbhYKJKQL");
        setIntField(term105158, term105158.getClass(), "lastRegionId", -841682366);
        setField(term105158, term105158.getClass(), "lastRegionName", "CssqWIyxap");
        setIntField(term105158, term105158.getClass(), "lastAllNetId", 974285842);
        setField(term105158, term105158.getClass(), "lastClientId", "EtmaqZMoVN");
        setIntField(term105158, term105158.getClass(), "lastUsedDeckId", 104380458);
        setIntField(term105158, term105158.getClass(), "lastPlayMusicLevel", 2035665173);
        setIntField(term105158, term105158.getClass(), "lastEmoneyBrand", 1551975054);
        setField(term105156, term105156.getClass(), "user", term105158);
        setIntField(term105156, term105156.getClass(), "itemKind", 1198414570);
        setIntField(term105156, term105156.getClass(), "itemId", -1816324255);
        setIntField(term105156, term105156.getClass(), "stock", 989418926);
        setBooleanField(term105156, term105156.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term105156, args);
    }

};


