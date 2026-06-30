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

public class UserData_setUserName_39684850364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49038;

    public UserData_setUserName_39684850364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49042 = new Long(-6342139649364011743L);
        term49038 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term49040 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49071 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49038, term49038.getClass(), "id", 560784718707260252L);
        setLongField(term49040, term49040.getClass(), "id", -3516575907450439911L);
        setField(term49040, term49040.getClass(), "extId", term49042);
        setField(term49040, term49040.getClass(), "luid", "NjmSJhbVEM");
        setIntField(term49057, term49057.getClass(), "year", 2028);
        setShortField(term49057, term49057.getClass(), "month", (short) 12);
        setShortField(term49057, term49057.getClass(), "day", (short) 2);
        setField(term49056, term49056.getClass(), "date", term49057);
        setByteField(term49061, term49061.getClass(), "hour", (byte) 18);
        setByteField(term49061, term49061.getClass(), "minute", (byte) 6);
        setByteField(term49061, term49061.getClass(), "second", (byte) 45);
        setIntField(term49061, term49061.getClass(), "nano", 967474945);
        setField(term49056, term49056.getClass(), "time", term49061);
        setField(term49040, term49040.getClass(), "registerTime", term49056);
        setIntField(term49067, term49067.getClass(), "year", 2018);
        setShortField(term49067, term49067.getClass(), "month", (short) 11);
        setShortField(term49067, term49067.getClass(), "day", (short) 11);
        setField(term49066, term49066.getClass(), "date", term49067);
        setByteField(term49071, term49071.getClass(), "hour", (byte) 11);
        setByteField(term49071, term49071.getClass(), "minute", (byte) 30);
        setByteField(term49071, term49071.getClass(), "second", (byte) 33);
        setIntField(term49071, term49071.getClass(), "nano", 101261443);
        setField(term49066, term49066.getClass(), "time", term49071);
        setField(term49040, term49040.getClass(), "accessTime", term49066);
        setField(term49038, term49038.getClass(), "card", term49040);
        setField(term49038, term49038.getClass(), "userName", "aftnGRjhKN");
        setIntField(term49038, term49038.getClass(), "level", 2107931912);
        setIntField(term49038, term49038.getClass(), "reincarnationNum", 198562318);
        setLongField(term49038, term49038.getClass(), "exp", -888272683506995872L);
        setLongField(term49038, term49038.getClass(), "point", -4435966730765688655L);
        setLongField(term49038, term49038.getClass(), "totalPoint", -6124911442117089800L);
        setIntField(term49038, term49038.getClass(), "playCount", 1164105108);
        setIntField(term49038, term49038.getClass(), "jewelCount", -972073241);
        setIntField(term49038, term49038.getClass(), "totalJewelCount", 643112473);
        setIntField(term49038, term49038.getClass(), "medalCount", -1141492053);
        setIntField(term49038, term49038.getClass(), "playerRating", 1094053796);
        setIntField(term49038, term49038.getClass(), "highestRating", -2097088884);
        setIntField(term49038, term49038.getClass(), "battlePoint", -1793718020);
        setIntField(term49038, term49038.getClass(), "bestBattlePoint", 1087957895);
        setIntField(term49038, term49038.getClass(), "overDamageBattlePoint", -1347788838);
        setBooleanField(term49038, term49038.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term49038, term49038.getClass(), "nameplateId", -83628231);
        setIntField(term49038, term49038.getClass(), "trophyId", 1337550691);
        setIntField(term49038, term49038.getClass(), "cardId", 2107385711);
        setIntField(term49038, term49038.getClass(), "characterId", 986298442);
        setIntField(term49038, term49038.getClass(), "characterVoiceNo", 1751660702);
        setIntField(term49038, term49038.getClass(), "tabSetting", 433217860);
        setIntField(term49038, term49038.getClass(), "tabSortSetting", 495773924);
        setIntField(term49038, term49038.getClass(), "cardCategorySetting", 1485597364);
        setIntField(term49038, term49038.getClass(), "cardSortSetting", 1232259140);
        setIntField(term49038, term49038.getClass(), "rivalScoreCategorySetting", -1371367751);
        setIntField(term49038, term49038.getClass(), "playedTutorialBit", -954813389);
        setIntField(term49038, term49038.getClass(), "firstTutorialCancelNum", -232542458);
        setLongField(term49038, term49038.getClass(), "sumTechHighScore", 6546757320645808936L);
        setLongField(term49038, term49038.getClass(), "sumTechBasicHighScore", 2295698553856643996L);
        setLongField(term49038, term49038.getClass(), "sumTechAdvancedHighScore", 7308834671443110196L);
        setLongField(term49038, term49038.getClass(), "sumTechExpertHighScore", 8524310798833172304L);
        setLongField(term49038, term49038.getClass(), "sumTechMasterHighScore", -5865325072540492518L);
        setLongField(term49038, term49038.getClass(), "sumTechLunaticHighScore", 6575839504960308925L);
        setLongField(term49038, term49038.getClass(), "sumBattleHighScore", 3973872355126462836L);
        setLongField(term49038, term49038.getClass(), "sumBattleBasicHighScore", 3546596014708806813L);
        setLongField(term49038, term49038.getClass(), "sumBattleAdvancedHighScore", -2670369629600189900L);
        setLongField(term49038, term49038.getClass(), "sumBattleExpertHighScore", -177713589369472164L);
        setLongField(term49038, term49038.getClass(), "sumBattleMasterHighScore", 792816556387097064L);
        setLongField(term49038, term49038.getClass(), "sumBattleLunaticHighScore", 5391287373597316604L);
        setField(term49038, term49038.getClass(), "eventWatchedDate", "TirWkyiCHh");
        setField(term49038, term49038.getClass(), "cmEventWatchedDate", "lsQrIFMkgZ");
        setField(term49038, term49038.getClass(), "firstGameId", "VgAyBhgBhq");
        setField(term49038, term49038.getClass(), "firstRomVersion", "nhpssUKjpK");
        setField(term49038, term49038.getClass(), "firstDataVersion", "lnJVsFNsCN");
        setField(term49038, term49038.getClass(), "firstPlayDate", "CUagRkEuzN");
        setField(term49038, term49038.getClass(), "lastGameId", "eWIWfWobXm");
        setField(term49038, term49038.getClass(), "lastRomVersion", "lkPJVVXhDd");
        setField(term49038, term49038.getClass(), "lastDataVersion", "OpMnUyJTrb");
        setField(term49038, term49038.getClass(), "compatibleCmVersion", "ACBGZgugev");
        setField(term49038, term49038.getClass(), "lastPlayDate", "rcbQDpUkab");
        setIntField(term49038, term49038.getClass(), "lastPlaceId", -106999876);
        setField(term49038, term49038.getClass(), "lastPlaceName", "oZAbUeXmhW");
        setIntField(term49038, term49038.getClass(), "lastRegionId", -2129996761);
        setField(term49038, term49038.getClass(), "lastRegionName", "NDSDpOeQda");
        setIntField(term49038, term49038.getClass(), "lastAllNetId", 1822990018);
        setField(term49038, term49038.getClass(), "lastClientId", "HlKwxzAqTg");
        setIntField(term49038, term49038.getClass(), "lastUsedDeckId", -417542619);
        setIntField(term49038, term49038.getClass(), "lastPlayMusicLevel", 562244123);
        setIntField(term49038, term49038.getClass(), "lastEmoneyBrand", -1020238686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xKjkdjTYfe";
        callMethod(klass, "setUserName", argTypes, term49038, args);
    }

};


