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

public class UserData_getTabSetting_129683199923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31647;

    public UserData_getTabSetting_129683199923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31651 = new Long(41775768178052008L);
        term31647 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term31649 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term31665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31680 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term31647, term31647.getClass(), "id", -1750953812188769604L);
        setLongField(term31649, term31649.getClass(), "id", -2708952612032666340L);
        setField(term31649, term31649.getClass(), "extId", term31651);
        setField(term31649, term31649.getClass(), "luid", "VsFWNMdyRt");
        setIntField(term31666, term31666.getClass(), "year", 2023);
        setShortField(term31666, term31666.getClass(), "month", (short) 5);
        setShortField(term31666, term31666.getClass(), "day", (short) 31);
        setField(term31665, term31665.getClass(), "date", term31666);
        setByteField(term31670, term31670.getClass(), "hour", (byte) 13);
        setByteField(term31670, term31670.getClass(), "minute", (byte) 29);
        setByteField(term31670, term31670.getClass(), "second", (byte) 29);
        setIntField(term31670, term31670.getClass(), "nano", 621312201);
        setField(term31665, term31665.getClass(), "time", term31670);
        setField(term31649, term31649.getClass(), "registerTime", term31665);
        setIntField(term31676, term31676.getClass(), "year", 2020);
        setShortField(term31676, term31676.getClass(), "month", (short) 10);
        setShortField(term31676, term31676.getClass(), "day", (short) 26);
        setField(term31675, term31675.getClass(), "date", term31676);
        setByteField(term31680, term31680.getClass(), "hour", (byte) 10);
        setByteField(term31680, term31680.getClass(), "minute", (byte) 50);
        setByteField(term31680, term31680.getClass(), "second", (byte) 16);
        setIntField(term31680, term31680.getClass(), "nano", 613429);
        setField(term31675, term31675.getClass(), "time", term31680);
        setField(term31649, term31649.getClass(), "accessTime", term31675);
        setField(term31647, term31647.getClass(), "card", term31649);
        setField(term31647, term31647.getClass(), "userName", "QaoYFZhScg");
        setIntField(term31647, term31647.getClass(), "level", 1680632578);
        setIntField(term31647, term31647.getClass(), "reincarnationNum", 511399994);
        setLongField(term31647, term31647.getClass(), "exp", -1148993446345293581L);
        setLongField(term31647, term31647.getClass(), "point", 6614269735692083780L);
        setLongField(term31647, term31647.getClass(), "totalPoint", 7437006125284633666L);
        setIntField(term31647, term31647.getClass(), "playCount", 2094923086);
        setIntField(term31647, term31647.getClass(), "jewelCount", 1532355365);
        setIntField(term31647, term31647.getClass(), "totalJewelCount", -156316508);
        setIntField(term31647, term31647.getClass(), "medalCount", -1304449497);
        setIntField(term31647, term31647.getClass(), "playerRating", -80320412);
        setIntField(term31647, term31647.getClass(), "highestRating", -356797136);
        setIntField(term31647, term31647.getClass(), "battlePoint", -2035641970);
        setIntField(term31647, term31647.getClass(), "bestBattlePoint", 1813581230);
        setIntField(term31647, term31647.getClass(), "overDamageBattlePoint", 844569461);
        setBooleanField(term31647, term31647.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term31647, term31647.getClass(), "nameplateId", -15085966);
        setIntField(term31647, term31647.getClass(), "trophyId", -1929631412);
        setIntField(term31647, term31647.getClass(), "cardId", 1014160441);
        setIntField(term31647, term31647.getClass(), "characterId", 975753484);
        setIntField(term31647, term31647.getClass(), "characterVoiceNo", -1886360357);
        setIntField(term31647, term31647.getClass(), "tabSetting", -235867268);
        setIntField(term31647, term31647.getClass(), "tabSortSetting", -972330704);
        setIntField(term31647, term31647.getClass(), "cardCategorySetting", 134173297);
        setIntField(term31647, term31647.getClass(), "cardSortSetting", 2025698852);
        setIntField(term31647, term31647.getClass(), "rivalScoreCategorySetting", 113961338);
        setIntField(term31647, term31647.getClass(), "playedTutorialBit", 1869277085);
        setIntField(term31647, term31647.getClass(), "firstTutorialCancelNum", 498801287);
        setLongField(term31647, term31647.getClass(), "sumTechHighScore", 7426144489061842120L);
        setLongField(term31647, term31647.getClass(), "sumTechBasicHighScore", -7501037219137334101L);
        setLongField(term31647, term31647.getClass(), "sumTechAdvancedHighScore", -5898738968422709494L);
        setLongField(term31647, term31647.getClass(), "sumTechExpertHighScore", 1222571199408067081L);
        setLongField(term31647, term31647.getClass(), "sumTechMasterHighScore", -3672309483214533219L);
        setLongField(term31647, term31647.getClass(), "sumTechLunaticHighScore", -2448708288718122671L);
        setLongField(term31647, term31647.getClass(), "sumBattleHighScore", 7391856662550454315L);
        setLongField(term31647, term31647.getClass(), "sumBattleBasicHighScore", -6573442531269156325L);
        setLongField(term31647, term31647.getClass(), "sumBattleAdvancedHighScore", -2326118746160954215L);
        setLongField(term31647, term31647.getClass(), "sumBattleExpertHighScore", 6091220404570069089L);
        setLongField(term31647, term31647.getClass(), "sumBattleMasterHighScore", 8116689826697820264L);
        setLongField(term31647, term31647.getClass(), "sumBattleLunaticHighScore", 6594952836231202437L);
        setField(term31647, term31647.getClass(), "eventWatchedDate", "UTvXIenLCR");
        setField(term31647, term31647.getClass(), "cmEventWatchedDate", "PLeKpWaxhQ");
        setField(term31647, term31647.getClass(), "firstGameId", "EBSKhqDdUW");
        setField(term31647, term31647.getClass(), "firstRomVersion", "LvLbdICdfA");
        setField(term31647, term31647.getClass(), "firstDataVersion", "rtifrlITwl");
        setField(term31647, term31647.getClass(), "firstPlayDate", "yGWXZDjnPS");
        setField(term31647, term31647.getClass(), "lastGameId", "vZucxbGVyo");
        setField(term31647, term31647.getClass(), "lastRomVersion", "ZZoLNbeORl");
        setField(term31647, term31647.getClass(), "lastDataVersion", "XjIOUIzJUP");
        setField(term31647, term31647.getClass(), "compatibleCmVersion", "iGTpXnnTqB");
        setField(term31647, term31647.getClass(), "lastPlayDate", "XgJzBOYfQB");
        setIntField(term31647, term31647.getClass(), "lastPlaceId", 969573395);
        setField(term31647, term31647.getClass(), "lastPlaceName", "GAPGgDekVG");
        setIntField(term31647, term31647.getClass(), "lastRegionId", -899109027);
        setField(term31647, term31647.getClass(), "lastRegionName", "WmTogHwGLE");
        setIntField(term31647, term31647.getClass(), "lastAllNetId", -694297070);
        setField(term31647, term31647.getClass(), "lastClientId", "qYOIXsGycY");
        setIntField(term31647, term31647.getClass(), "lastUsedDeckId", 786551253);
        setIntField(term31647, term31647.getClass(), "lastPlayMusicLevel", -104779523);
        setIntField(term31647, term31647.getClass(), "lastEmoneyBrand", 749289511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSetting", argTypes, term31647, args);
    }

};


