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

public class UserData_getLevel_2555433963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23187;

    public UserData_getLevel_2555433963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23191 = new Long(-1154553077993834885L);
        term23187 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term23189 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23220 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23187, term23187.getClass(), "id", -6289397283685653555L);
        setLongField(term23189, term23189.getClass(), "id", 4270489998641176236L);
        setField(term23189, term23189.getClass(), "extId", term23191);
        setField(term23189, term23189.getClass(), "luid", "UsxeLMVkAK");
        setIntField(term23206, term23206.getClass(), "year", 2013);
        setShortField(term23206, term23206.getClass(), "month", (short) 7);
        setShortField(term23206, term23206.getClass(), "day", (short) 26);
        setField(term23205, term23205.getClass(), "date", term23206);
        setByteField(term23210, term23210.getClass(), "hour", (byte) 14);
        setByteField(term23210, term23210.getClass(), "minute", (byte) 45);
        setByteField(term23210, term23210.getClass(), "second", (byte) 33);
        setIntField(term23210, term23210.getClass(), "nano", 547995853);
        setField(term23205, term23205.getClass(), "time", term23210);
        setField(term23189, term23189.getClass(), "registerTime", term23205);
        setIntField(term23216, term23216.getClass(), "year", 2016);
        setShortField(term23216, term23216.getClass(), "month", (short) 12);
        setShortField(term23216, term23216.getClass(), "day", (short) 20);
        setField(term23215, term23215.getClass(), "date", term23216);
        setByteField(term23220, term23220.getClass(), "hour", (byte) 8);
        setByteField(term23220, term23220.getClass(), "minute", (byte) 46);
        setByteField(term23220, term23220.getClass(), "second", (byte) 16);
        setIntField(term23220, term23220.getClass(), "nano", 10071864);
        setField(term23215, term23215.getClass(), "time", term23220);
        setField(term23189, term23189.getClass(), "accessTime", term23215);
        setField(term23187, term23187.getClass(), "card", term23189);
        setField(term23187, term23187.getClass(), "userName", "ITrhiKKzcb");
        setIntField(term23187, term23187.getClass(), "level", 752858379);
        setIntField(term23187, term23187.getClass(), "reincarnationNum", -370819357);
        setLongField(term23187, term23187.getClass(), "exp", 7649159120514186821L);
        setLongField(term23187, term23187.getClass(), "point", 9219442829218784847L);
        setLongField(term23187, term23187.getClass(), "totalPoint", 5153056225441125523L);
        setIntField(term23187, term23187.getClass(), "playCount", -71819242);
        setIntField(term23187, term23187.getClass(), "jewelCount", 1268893136);
        setIntField(term23187, term23187.getClass(), "totalJewelCount", -1472700822);
        setIntField(term23187, term23187.getClass(), "medalCount", 1626670889);
        setIntField(term23187, term23187.getClass(), "playerRating", -2117361140);
        setIntField(term23187, term23187.getClass(), "highestRating", 407708341);
        setIntField(term23187, term23187.getClass(), "battlePoint", -287519200);
        setIntField(term23187, term23187.getClass(), "bestBattlePoint", -1490696181);
        setIntField(term23187, term23187.getClass(), "overDamageBattlePoint", 623717232);
        setBooleanField(term23187, term23187.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term23187, term23187.getClass(), "nameplateId", -1413291732);
        setIntField(term23187, term23187.getClass(), "trophyId", 203264365);
        setIntField(term23187, term23187.getClass(), "cardId", -1066281036);
        setIntField(term23187, term23187.getClass(), "characterId", 30837706);
        setIntField(term23187, term23187.getClass(), "characterVoiceNo", 379523101);
        setIntField(term23187, term23187.getClass(), "tabSetting", 1017354215);
        setIntField(term23187, term23187.getClass(), "tabSortSetting", 695330987);
        setIntField(term23187, term23187.getClass(), "cardCategorySetting", -267289967);
        setIntField(term23187, term23187.getClass(), "cardSortSetting", 773432822);
        setIntField(term23187, term23187.getClass(), "rivalScoreCategorySetting", -488294922);
        setIntField(term23187, term23187.getClass(), "playedTutorialBit", -397161164);
        setIntField(term23187, term23187.getClass(), "firstTutorialCancelNum", -703717191);
        setLongField(term23187, term23187.getClass(), "sumTechHighScore", 8082286259336326914L);
        setLongField(term23187, term23187.getClass(), "sumTechBasicHighScore", 1093716108786896379L);
        setLongField(term23187, term23187.getClass(), "sumTechAdvancedHighScore", 3917904228139004931L);
        setLongField(term23187, term23187.getClass(), "sumTechExpertHighScore", -2746162973618820048L);
        setLongField(term23187, term23187.getClass(), "sumTechMasterHighScore", -5466267958566655205L);
        setLongField(term23187, term23187.getClass(), "sumTechLunaticHighScore", 4066162530086558234L);
        setLongField(term23187, term23187.getClass(), "sumBattleHighScore", -1519007571673072893L);
        setLongField(term23187, term23187.getClass(), "sumBattleBasicHighScore", -2965107112757796135L);
        setLongField(term23187, term23187.getClass(), "sumBattleAdvancedHighScore", 8628710602325472259L);
        setLongField(term23187, term23187.getClass(), "sumBattleExpertHighScore", -6397802456253967096L);
        setLongField(term23187, term23187.getClass(), "sumBattleMasterHighScore", -5097855288490086692L);
        setLongField(term23187, term23187.getClass(), "sumBattleLunaticHighScore", -8356953418230835643L);
        setField(term23187, term23187.getClass(), "eventWatchedDate", "qMKmSzOQXg");
        setField(term23187, term23187.getClass(), "cmEventWatchedDate", "CURQCMkqbZ");
        setField(term23187, term23187.getClass(), "firstGameId", "VZwkkQktrm");
        setField(term23187, term23187.getClass(), "firstRomVersion", "wIuJvIvEMb");
        setField(term23187, term23187.getClass(), "firstDataVersion", "EyojsbSjWT");
        setField(term23187, term23187.getClass(), "firstPlayDate", "szGicGyWDL");
        setField(term23187, term23187.getClass(), "lastGameId", "lkdvUiYwRq");
        setField(term23187, term23187.getClass(), "lastRomVersion", "XuxkPrpfND");
        setField(term23187, term23187.getClass(), "lastDataVersion", "OxNXeKMDje");
        setField(term23187, term23187.getClass(), "compatibleCmVersion", "hGTqHomrbc");
        setField(term23187, term23187.getClass(), "lastPlayDate", "NNMBrIWEBw");
        setIntField(term23187, term23187.getClass(), "lastPlaceId", -1255535445);
        setField(term23187, term23187.getClass(), "lastPlaceName", "GrTaccOQzl");
        setIntField(term23187, term23187.getClass(), "lastRegionId", -2033952124);
        setField(term23187, term23187.getClass(), "lastRegionName", "uuSYOUCVHU");
        setIntField(term23187, term23187.getClass(), "lastAllNetId", 560401653);
        setField(term23187, term23187.getClass(), "lastClientId", "DfWwbodtVw");
        setIntField(term23187, term23187.getClass(), "lastUsedDeckId", 1633691536);
        setIntField(term23187, term23187.getClass(), "lastPlayMusicLevel", 898165245);
        setIntField(term23187, term23187.getClass(), "lastEmoneyBrand", 1810754549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term23187, args);
    }

};


