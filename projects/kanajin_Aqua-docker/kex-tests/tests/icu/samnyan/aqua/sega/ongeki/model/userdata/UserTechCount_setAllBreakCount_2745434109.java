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
import java.lang.Integer;

public class UserTechCount_setAllBreakCount_2745434109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365964;
     Object term366232;

    public UserTechCount_setAllBreakCount_2745434109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term365970 = new Long(-8148408579143384073L);
        term365964 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term365966 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term365968 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term365984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term365985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term365994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term365995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365999 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term365964, term365964.getClass(), "id", -6831201864906417100L);
        setLongField(term365966, term365966.getClass(), "id", 7606196427359295419L);
        setLongField(term365968, term365968.getClass(), "id", -6550959403104452987L);
        setField(term365968, term365968.getClass(), "extId", term365970);
        setField(term365968, term365968.getClass(), "luid", "KsUUmluzsi");
        setIntField(term365985, term365985.getClass(), "year", 2014);
        setShortField(term365985, term365985.getClass(), "month", (short) 1);
        setShortField(term365985, term365985.getClass(), "day", (short) 18);
        setField(term365984, term365984.getClass(), "date", term365985);
        setByteField(term365989, term365989.getClass(), "hour", (byte) 4);
        setByteField(term365989, term365989.getClass(), "minute", (byte) 10);
        setByteField(term365989, term365989.getClass(), "second", (byte) 6);
        setIntField(term365989, term365989.getClass(), "nano", 867885417);
        setField(term365984, term365984.getClass(), "time", term365989);
        setField(term365968, term365968.getClass(), "registerTime", term365984);
        setIntField(term365995, term365995.getClass(), "year", 2010);
        setShortField(term365995, term365995.getClass(), "month", (short) 11);
        setShortField(term365995, term365995.getClass(), "day", (short) 27);
        setField(term365994, term365994.getClass(), "date", term365995);
        setByteField(term365999, term365999.getClass(), "hour", (byte) 6);
        setByteField(term365999, term365999.getClass(), "minute", (byte) 5);
        setByteField(term365999, term365999.getClass(), "second", (byte) 12);
        setIntField(term365999, term365999.getClass(), "nano", 189662781);
        setField(term365994, term365994.getClass(), "time", term365999);
        setField(term365968, term365968.getClass(), "accessTime", term365994);
        setField(term365966, term365966.getClass(), "card", term365968);
        setField(term365966, term365966.getClass(), "userName", "CWdYUcTZEH");
        setIntField(term365966, term365966.getClass(), "level", 1182375487);
        setIntField(term365966, term365966.getClass(), "reincarnationNum", 729016838);
        setLongField(term365966, term365966.getClass(), "exp", -6334164432658047853L);
        setLongField(term365966, term365966.getClass(), "point", -5303233522125256837L);
        setLongField(term365966, term365966.getClass(), "totalPoint", 2252921011839008450L);
        setIntField(term365966, term365966.getClass(), "playCount", 1035690903);
        setIntField(term365966, term365966.getClass(), "jewelCount", -738221544);
        setIntField(term365966, term365966.getClass(), "totalJewelCount", -844072174);
        setIntField(term365966, term365966.getClass(), "medalCount", 1942255231);
        setIntField(term365966, term365966.getClass(), "playerRating", -38552391);
        setIntField(term365966, term365966.getClass(), "highestRating", -1720846460);
        setIntField(term365966, term365966.getClass(), "battlePoint", 2123387268);
        setIntField(term365966, term365966.getClass(), "bestBattlePoint", 577350239);
        setIntField(term365966, term365966.getClass(), "overDamageBattlePoint", -553689873);
        setBooleanField(term365966, term365966.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term365966, term365966.getClass(), "nameplateId", 1035031080);
        setIntField(term365966, term365966.getClass(), "trophyId", 1069451278);
        setIntField(term365966, term365966.getClass(), "cardId", 1796756892);
        setIntField(term365966, term365966.getClass(), "characterId", 638162836);
        setIntField(term365966, term365966.getClass(), "characterVoiceNo", -304078697);
        setIntField(term365966, term365966.getClass(), "tabSetting", -1509857885);
        setIntField(term365966, term365966.getClass(), "tabSortSetting", -962658700);
        setIntField(term365966, term365966.getClass(), "cardCategorySetting", -784959123);
        setIntField(term365966, term365966.getClass(), "cardSortSetting", -283946318);
        setIntField(term365966, term365966.getClass(), "rivalScoreCategorySetting", -858170911);
        setIntField(term365966, term365966.getClass(), "playedTutorialBit", -1963436147);
        setIntField(term365966, term365966.getClass(), "firstTutorialCancelNum", 269708797);
        setLongField(term365966, term365966.getClass(), "sumTechHighScore", -4543627597381411440L);
        setLongField(term365966, term365966.getClass(), "sumTechBasicHighScore", -6737962231869814147L);
        setLongField(term365966, term365966.getClass(), "sumTechAdvancedHighScore", 921079750278891097L);
        setLongField(term365966, term365966.getClass(), "sumTechExpertHighScore", 6508896698266102029L);
        setLongField(term365966, term365966.getClass(), "sumTechMasterHighScore", 6986815471551812621L);
        setLongField(term365966, term365966.getClass(), "sumTechLunaticHighScore", 9211210951159264246L);
        setLongField(term365966, term365966.getClass(), "sumBattleHighScore", -7400953637396322489L);
        setLongField(term365966, term365966.getClass(), "sumBattleBasicHighScore", 2669146431194355291L);
        setLongField(term365966, term365966.getClass(), "sumBattleAdvancedHighScore", -9215445303581800182L);
        setLongField(term365966, term365966.getClass(), "sumBattleExpertHighScore", 1247492557036953760L);
        setLongField(term365966, term365966.getClass(), "sumBattleMasterHighScore", 5763941404334203142L);
        setLongField(term365966, term365966.getClass(), "sumBattleLunaticHighScore", -2278354913392020912L);
        setField(term365966, term365966.getClass(), "eventWatchedDate", "nFFbzSuOFR");
        setField(term365966, term365966.getClass(), "cmEventWatchedDate", "OOjipcHMcJ");
        setField(term365966, term365966.getClass(), "firstGameId", "PDMufDYuoK");
        setField(term365966, term365966.getClass(), "firstRomVersion", "hpVTpWrSUB");
        setField(term365966, term365966.getClass(), "firstDataVersion", "iQBljDNMnf");
        setField(term365966, term365966.getClass(), "firstPlayDate", "FZHLLlMvQk");
        setField(term365966, term365966.getClass(), "lastGameId", "JUJCvrQBzT");
        setField(term365966, term365966.getClass(), "lastRomVersion", "lZINKeQyFf");
        setField(term365966, term365966.getClass(), "lastDataVersion", "xYpgXjoror");
        setField(term365966, term365966.getClass(), "compatibleCmVersion", "DxxKHLavAQ");
        setField(term365966, term365966.getClass(), "lastPlayDate", "NqNhMkhwDY");
        setIntField(term365966, term365966.getClass(), "lastPlaceId", 1410741870);
        setField(term365966, term365966.getClass(), "lastPlaceName", "dYQImRUWxM");
        setIntField(term365966, term365966.getClass(), "lastRegionId", 795481218);
        setField(term365966, term365966.getClass(), "lastRegionName", "YeqJmNmIIY");
        setIntField(term365966, term365966.getClass(), "lastAllNetId", -393448355);
        setField(term365966, term365966.getClass(), "lastClientId", "hcZXAXYxdU");
        setIntField(term365966, term365966.getClass(), "lastUsedDeckId", -1319344618);
        setIntField(term365966, term365966.getClass(), "lastPlayMusicLevel", 1588649178);
        setIntField(term365966, term365966.getClass(), "lastEmoneyBrand", -2087116776);
        setField(term365964, term365964.getClass(), "user", term365966);
        setIntField(term365964, term365964.getClass(), "levelId", 1797677003);
        setIntField(term365964, term365964.getClass(), "allBreakCount", -938191949);
        setIntField(term365964, term365964.getClass(), "allBreakPlusCount", -909816992);
        term366232 = new Integer(-445713415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366232;
        callMethod(klass, "setAllBreakCount", argTypes, term365964, args);
    }

};


