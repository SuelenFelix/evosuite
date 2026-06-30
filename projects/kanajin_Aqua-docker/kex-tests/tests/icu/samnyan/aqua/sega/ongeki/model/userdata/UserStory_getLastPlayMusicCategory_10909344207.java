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

public class UserStory_getLastPlayMusicCategory_10909344207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160643;

    public UserStory_getLastPlayMusicCategory_10909344207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160649 = new Long(-3225860270104198596L);
        term160643 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term160645 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term160647 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160678 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160643, term160643.getClass(), "id", -311687515551036519L);
        setLongField(term160645, term160645.getClass(), "id", 87551356764990866L);
        setLongField(term160647, term160647.getClass(), "id", 8849213552795917680L);
        setField(term160647, term160647.getClass(), "extId", term160649);
        setField(term160647, term160647.getClass(), "luid", "vcDcmZWIgW");
        setIntField(term160664, term160664.getClass(), "year", 2016);
        setShortField(term160664, term160664.getClass(), "month", (short) 4);
        setShortField(term160664, term160664.getClass(), "day", (short) 16);
        setField(term160663, term160663.getClass(), "date", term160664);
        setByteField(term160668, term160668.getClass(), "hour", (byte) 16);
        setByteField(term160668, term160668.getClass(), "minute", (byte) 43);
        setByteField(term160668, term160668.getClass(), "second", (byte) 51);
        setIntField(term160668, term160668.getClass(), "nano", 40671521);
        setField(term160663, term160663.getClass(), "time", term160668);
        setField(term160647, term160647.getClass(), "registerTime", term160663);
        setIntField(term160674, term160674.getClass(), "year", 2028);
        setShortField(term160674, term160674.getClass(), "month", (short) 7);
        setShortField(term160674, term160674.getClass(), "day", (short) 13);
        setField(term160673, term160673.getClass(), "date", term160674);
        setByteField(term160678, term160678.getClass(), "hour", (byte) 9);
        setByteField(term160678, term160678.getClass(), "minute", (byte) 46);
        setByteField(term160678, term160678.getClass(), "second", (byte) 40);
        setIntField(term160678, term160678.getClass(), "nano", 919051236);
        setField(term160673, term160673.getClass(), "time", term160678);
        setField(term160647, term160647.getClass(), "accessTime", term160673);
        setField(term160645, term160645.getClass(), "card", term160647);
        setField(term160645, term160645.getClass(), "userName", "hpFqndTGJq");
        setIntField(term160645, term160645.getClass(), "level", -1633893651);
        setIntField(term160645, term160645.getClass(), "reincarnationNum", -104469333);
        setLongField(term160645, term160645.getClass(), "exp", 8129767110064217080L);
        setLongField(term160645, term160645.getClass(), "point", -7275485705677278587L);
        setLongField(term160645, term160645.getClass(), "totalPoint", -211018543573261035L);
        setIntField(term160645, term160645.getClass(), "playCount", 154770061);
        setIntField(term160645, term160645.getClass(), "jewelCount", 1923537756);
        setIntField(term160645, term160645.getClass(), "totalJewelCount", 1759570934);
        setIntField(term160645, term160645.getClass(), "medalCount", -650039812);
        setIntField(term160645, term160645.getClass(), "playerRating", 986533686);
        setIntField(term160645, term160645.getClass(), "highestRating", -939119176);
        setIntField(term160645, term160645.getClass(), "battlePoint", -455814151);
        setIntField(term160645, term160645.getClass(), "bestBattlePoint", 1100360523);
        setIntField(term160645, term160645.getClass(), "overDamageBattlePoint", 1962499910);
        setBooleanField(term160645, term160645.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term160645, term160645.getClass(), "nameplateId", -939758416);
        setIntField(term160645, term160645.getClass(), "trophyId", -1099676971);
        setIntField(term160645, term160645.getClass(), "cardId", 826860572);
        setIntField(term160645, term160645.getClass(), "characterId", 1080879900);
        setIntField(term160645, term160645.getClass(), "characterVoiceNo", -35783514);
        setIntField(term160645, term160645.getClass(), "tabSetting", -1751212981);
        setIntField(term160645, term160645.getClass(), "tabSortSetting", -573316300);
        setIntField(term160645, term160645.getClass(), "cardCategorySetting", 578872264);
        setIntField(term160645, term160645.getClass(), "cardSortSetting", -278464853);
        setIntField(term160645, term160645.getClass(), "rivalScoreCategorySetting", 184087281);
        setIntField(term160645, term160645.getClass(), "playedTutorialBit", 467765373);
        setIntField(term160645, term160645.getClass(), "firstTutorialCancelNum", 1278171430);
        setLongField(term160645, term160645.getClass(), "sumTechHighScore", 7578564556666028187L);
        setLongField(term160645, term160645.getClass(), "sumTechBasicHighScore", 652539985166333609L);
        setLongField(term160645, term160645.getClass(), "sumTechAdvancedHighScore", 6734275631255863271L);
        setLongField(term160645, term160645.getClass(), "sumTechExpertHighScore", -6137121667863437060L);
        setLongField(term160645, term160645.getClass(), "sumTechMasterHighScore", 1286359190898506191L);
        setLongField(term160645, term160645.getClass(), "sumTechLunaticHighScore", -5312401346821386938L);
        setLongField(term160645, term160645.getClass(), "sumBattleHighScore", 9222544456917499892L);
        setLongField(term160645, term160645.getClass(), "sumBattleBasicHighScore", -8055960422626625967L);
        setLongField(term160645, term160645.getClass(), "sumBattleAdvancedHighScore", -1072612554039652494L);
        setLongField(term160645, term160645.getClass(), "sumBattleExpertHighScore", 7891904308631684957L);
        setLongField(term160645, term160645.getClass(), "sumBattleMasterHighScore", -5131124286038907802L);
        setLongField(term160645, term160645.getClass(), "sumBattleLunaticHighScore", -7758209801141975741L);
        setField(term160645, term160645.getClass(), "eventWatchedDate", "aLNaauObcW");
        setField(term160645, term160645.getClass(), "cmEventWatchedDate", "rKOiGTBanj");
        setField(term160645, term160645.getClass(), "firstGameId", "sUmSSAVUAl");
        setField(term160645, term160645.getClass(), "firstRomVersion", "bUrzffmZhc");
        setField(term160645, term160645.getClass(), "firstDataVersion", "hvogGekBHB");
        setField(term160645, term160645.getClass(), "firstPlayDate", "KAxZjUYFWX");
        setField(term160645, term160645.getClass(), "lastGameId", "dnWLZqVKzE");
        setField(term160645, term160645.getClass(), "lastRomVersion", "yKNhWIXreq");
        setField(term160645, term160645.getClass(), "lastDataVersion", "aGkAdbRgHR");
        setField(term160645, term160645.getClass(), "compatibleCmVersion", "SFoAEuJBfh");
        setField(term160645, term160645.getClass(), "lastPlayDate", "zXNGAMtbCF");
        setIntField(term160645, term160645.getClass(), "lastPlaceId", 513629950);
        setField(term160645, term160645.getClass(), "lastPlaceName", "zlBxjMwVHV");
        setIntField(term160645, term160645.getClass(), "lastRegionId", 1877595756);
        setField(term160645, term160645.getClass(), "lastRegionName", "rsBwYUCWbo");
        setIntField(term160645, term160645.getClass(), "lastAllNetId", 1018531116);
        setField(term160645, term160645.getClass(), "lastClientId", "VFJXkkRgdr");
        setIntField(term160645, term160645.getClass(), "lastUsedDeckId", -1243015891);
        setIntField(term160645, term160645.getClass(), "lastPlayMusicLevel", -691945518);
        setIntField(term160645, term160645.getClass(), "lastEmoneyBrand", -322481955);
        setField(term160643, term160643.getClass(), "user", term160645);
        setIntField(term160643, term160643.getClass(), "storyId", 1550329381);
        setIntField(term160643, term160643.getClass(), "lastChapterId", -69658488);
        setIntField(term160643, term160643.getClass(), "jewelCount", -949474221);
        setIntField(term160643, term160643.getClass(), "lastPlayMusicId", 954386331);
        setIntField(term160643, term160643.getClass(), "lastPlayMusicCategory", -356095843);
        setIntField(term160643, term160643.getClass(), "lastPlayMusicLevel", 1057672294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicCategory", argTypes, term160643, args);
    }

};


