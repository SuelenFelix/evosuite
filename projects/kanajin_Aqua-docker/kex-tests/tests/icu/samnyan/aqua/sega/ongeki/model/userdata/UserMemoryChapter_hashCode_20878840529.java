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

public class UserMemoryChapter_hashCode_20878840529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401991;

    public UserMemoryChapter_hashCode_20878840529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term401997 = new Long(132446939133186077L);
        term401991 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term401993 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term401995 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term402011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term402021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402026 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term401991, term401991.getClass(), "id", -5090083476376619601L);
        setLongField(term401993, term401993.getClass(), "id", 3233362963106306685L);
        setLongField(term401995, term401995.getClass(), "id", 8819129988249637928L);
        setField(term401995, term401995.getClass(), "extId", term401997);
        setField(term401995, term401995.getClass(), "luid", "LadAxADciE");
        setIntField(term402012, term402012.getClass(), "year", 2023);
        setShortField(term402012, term402012.getClass(), "month", (short) 1);
        setShortField(term402012, term402012.getClass(), "day", (short) 25);
        setField(term402011, term402011.getClass(), "date", term402012);
        setByteField(term402016, term402016.getClass(), "hour", (byte) 22);
        setByteField(term402016, term402016.getClass(), "minute", (byte) 19);
        setByteField(term402016, term402016.getClass(), "second", (byte) 20);
        setIntField(term402016, term402016.getClass(), "nano", 70906678);
        setField(term402011, term402011.getClass(), "time", term402016);
        setField(term401995, term401995.getClass(), "registerTime", term402011);
        setIntField(term402022, term402022.getClass(), "year", 2028);
        setShortField(term402022, term402022.getClass(), "month", (short) 10);
        setShortField(term402022, term402022.getClass(), "day", (short) 22);
        setField(term402021, term402021.getClass(), "date", term402022);
        setByteField(term402026, term402026.getClass(), "hour", (byte) 1);
        setByteField(term402026, term402026.getClass(), "minute", (byte) 18);
        setByteField(term402026, term402026.getClass(), "second", (byte) 46);
        setIntField(term402026, term402026.getClass(), "nano", 439817966);
        setField(term402021, term402021.getClass(), "time", term402026);
        setField(term401995, term401995.getClass(), "accessTime", term402021);
        setField(term401993, term401993.getClass(), "card", term401995);
        setField(term401993, term401993.getClass(), "userName", "rkjXosTvbN");
        setIntField(term401993, term401993.getClass(), "level", -804207014);
        setIntField(term401993, term401993.getClass(), "reincarnationNum", -1396691875);
        setLongField(term401993, term401993.getClass(), "exp", -649375634918728295L);
        setLongField(term401993, term401993.getClass(), "point", 7591162060290192571L);
        setLongField(term401993, term401993.getClass(), "totalPoint", 7933556287518447241L);
        setIntField(term401993, term401993.getClass(), "playCount", 997229538);
        setIntField(term401993, term401993.getClass(), "jewelCount", 1957050455);
        setIntField(term401993, term401993.getClass(), "totalJewelCount", 1346941952);
        setIntField(term401993, term401993.getClass(), "medalCount", -188143136);
        setIntField(term401993, term401993.getClass(), "playerRating", 1469334773);
        setIntField(term401993, term401993.getClass(), "highestRating", -1572987280);
        setIntField(term401993, term401993.getClass(), "battlePoint", 967397495);
        setIntField(term401993, term401993.getClass(), "bestBattlePoint", 2002386836);
        setIntField(term401993, term401993.getClass(), "overDamageBattlePoint", -844172798);
        setBooleanField(term401993, term401993.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term401993, term401993.getClass(), "nameplateId", 1703988374);
        setIntField(term401993, term401993.getClass(), "trophyId", 1705855430);
        setIntField(term401993, term401993.getClass(), "cardId", -468232373);
        setIntField(term401993, term401993.getClass(), "characterId", -1997028279);
        setIntField(term401993, term401993.getClass(), "characterVoiceNo", 346402059);
        setIntField(term401993, term401993.getClass(), "tabSetting", -1263722689);
        setIntField(term401993, term401993.getClass(), "tabSortSetting", -147202019);
        setIntField(term401993, term401993.getClass(), "cardCategorySetting", 937795116);
        setIntField(term401993, term401993.getClass(), "cardSortSetting", 950465319);
        setIntField(term401993, term401993.getClass(), "rivalScoreCategorySetting", 445711807);
        setIntField(term401993, term401993.getClass(), "playedTutorialBit", 454137688);
        setIntField(term401993, term401993.getClass(), "firstTutorialCancelNum", -577744109);
        setLongField(term401993, term401993.getClass(), "sumTechHighScore", -8470126707013662687L);
        setLongField(term401993, term401993.getClass(), "sumTechBasicHighScore", 6918389485665287999L);
        setLongField(term401993, term401993.getClass(), "sumTechAdvancedHighScore", -5804321305224591674L);
        setLongField(term401993, term401993.getClass(), "sumTechExpertHighScore", 4415872891600302153L);
        setLongField(term401993, term401993.getClass(), "sumTechMasterHighScore", -3414371718554283604L);
        setLongField(term401993, term401993.getClass(), "sumTechLunaticHighScore", 9129195907367634518L);
        setLongField(term401993, term401993.getClass(), "sumBattleHighScore", -3768337518626488946L);
        setLongField(term401993, term401993.getClass(), "sumBattleBasicHighScore", 5164043233066425336L);
        setLongField(term401993, term401993.getClass(), "sumBattleAdvancedHighScore", -6713909315583136696L);
        setLongField(term401993, term401993.getClass(), "sumBattleExpertHighScore", -1811224642316051541L);
        setLongField(term401993, term401993.getClass(), "sumBattleMasterHighScore", 2747672033504827510L);
        setLongField(term401993, term401993.getClass(), "sumBattleLunaticHighScore", 1642239165122276885L);
        setField(term401993, term401993.getClass(), "eventWatchedDate", "nBAtVlfxeb");
        setField(term401993, term401993.getClass(), "cmEventWatchedDate", "GlDhJkLHgd");
        setField(term401993, term401993.getClass(), "firstGameId", "ExORPbJoGL");
        setField(term401993, term401993.getClass(), "firstRomVersion", "mkFNmDEjgR");
        setField(term401993, term401993.getClass(), "firstDataVersion", "dRHBhjcXmK");
        setField(term401993, term401993.getClass(), "firstPlayDate", "uUtZwutIHm");
        setField(term401993, term401993.getClass(), "lastGameId", "IMGXNDMtcP");
        setField(term401993, term401993.getClass(), "lastRomVersion", "KnDWMwFoOA");
        setField(term401993, term401993.getClass(), "lastDataVersion", "pEIjRKaukO");
        setField(term401993, term401993.getClass(), "compatibleCmVersion", "UdfyuWYyMJ");
        setField(term401993, term401993.getClass(), "lastPlayDate", "lZxXJxyMEQ");
        setIntField(term401993, term401993.getClass(), "lastPlaceId", -652996758);
        setField(term401993, term401993.getClass(), "lastPlaceName", "dnhejIwuQJ");
        setIntField(term401993, term401993.getClass(), "lastRegionId", 1376144436);
        setField(term401993, term401993.getClass(), "lastRegionName", "KAjwGamqOX");
        setIntField(term401993, term401993.getClass(), "lastAllNetId", -809489228);
        setField(term401993, term401993.getClass(), "lastClientId", "ExfRpzGnja");
        setIntField(term401993, term401993.getClass(), "lastUsedDeckId", -368834157);
        setIntField(term401993, term401993.getClass(), "lastPlayMusicLevel", 1923010773);
        setIntField(term401993, term401993.getClass(), "lastEmoneyBrand", 906495071);
        setField(term401991, term401991.getClass(), "user", term401993);
        setIntField(term401991, term401991.getClass(), "chapterId", 515438027);
        setIntField(term401991, term401991.getClass(), "jewelCount", 1667636173);
        setIntField(term401991, term401991.getClass(), "lastPlayMusicCategory", 833144693);
        setIntField(term401991, term401991.getClass(), "lastPlayMusicId", -2008878118);
        setIntField(term401991, term401991.getClass(), "lastPlayMusicLevel", -2054675257);
        setBooleanField(term401991, term401991.getClass(), "isDialogWatched", false);
        setBooleanField(term401991, term401991.getClass(), "isStoryWatched", false);
        setBooleanField(term401991, term401991.getClass(), "isBossWatched", false);
        setBooleanField(term401991, term401991.getClass(), "isClear", true);
        setIntField(term401991, term401991.getClass(), "gaugeId", 1574771220);
        setIntField(term401991, term401991.getClass(), "gaugeNum", 429636671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term401991, args);
    }

};


