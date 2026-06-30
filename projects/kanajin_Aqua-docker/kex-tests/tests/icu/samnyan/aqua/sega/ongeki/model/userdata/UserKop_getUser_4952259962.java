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

public class UserKop_getUser_4952259962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271639;

    public UserKop_getUser_4952259962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271645 = new Long(-7840999196900383276L);
        term271639 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term271641 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term271643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271639, term271639.getClass(), "id", 6797723526381445483L);
        setLongField(term271641, term271641.getClass(), "id", -4840300996946705412L);
        setLongField(term271643, term271643.getClass(), "id", -3736180273027711550L);
        setField(term271643, term271643.getClass(), "extId", term271645);
        setField(term271643, term271643.getClass(), "luid", "DueBxOSGin");
        setIntField(term271660, term271660.getClass(), "year", 2013);
        setShortField(term271660, term271660.getClass(), "month", (short) 6);
        setShortField(term271660, term271660.getClass(), "day", (short) 1);
        setField(term271659, term271659.getClass(), "date", term271660);
        setByteField(term271664, term271664.getClass(), "hour", (byte) 4);
        setByteField(term271664, term271664.getClass(), "minute", (byte) 10);
        setByteField(term271664, term271664.getClass(), "second", (byte) 53);
        setIntField(term271664, term271664.getClass(), "nano", 464418403);
        setField(term271659, term271659.getClass(), "time", term271664);
        setField(term271643, term271643.getClass(), "registerTime", term271659);
        setIntField(term271670, term271670.getClass(), "year", 2018);
        setShortField(term271670, term271670.getClass(), "month", (short) 10);
        setShortField(term271670, term271670.getClass(), "day", (short) 24);
        setField(term271669, term271669.getClass(), "date", term271670);
        setByteField(term271674, term271674.getClass(), "hour", (byte) 3);
        setByteField(term271674, term271674.getClass(), "minute", (byte) 15);
        setByteField(term271674, term271674.getClass(), "second", (byte) 45);
        setIntField(term271674, term271674.getClass(), "nano", 835508246);
        setField(term271669, term271669.getClass(), "time", term271674);
        setField(term271643, term271643.getClass(), "accessTime", term271669);
        setField(term271641, term271641.getClass(), "card", term271643);
        setField(term271641, term271641.getClass(), "userName", "yxnzHzIPTj");
        setIntField(term271641, term271641.getClass(), "level", -1561622640);
        setIntField(term271641, term271641.getClass(), "reincarnationNum", 523331108);
        setLongField(term271641, term271641.getClass(), "exp", -5055672306019923480L);
        setLongField(term271641, term271641.getClass(), "point", -2851624770745286712L);
        setLongField(term271641, term271641.getClass(), "totalPoint", 4494466723384748335L);
        setIntField(term271641, term271641.getClass(), "playCount", -775698607);
        setIntField(term271641, term271641.getClass(), "jewelCount", 1440414800);
        setIntField(term271641, term271641.getClass(), "totalJewelCount", -1057338580);
        setIntField(term271641, term271641.getClass(), "medalCount", -482687562);
        setIntField(term271641, term271641.getClass(), "playerRating", 614734386);
        setIntField(term271641, term271641.getClass(), "highestRating", 1969128557);
        setIntField(term271641, term271641.getClass(), "battlePoint", -735661938);
        setIntField(term271641, term271641.getClass(), "bestBattlePoint", -2094281568);
        setIntField(term271641, term271641.getClass(), "overDamageBattlePoint", -1335091031);
        setBooleanField(term271641, term271641.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term271641, term271641.getClass(), "nameplateId", -99232346);
        setIntField(term271641, term271641.getClass(), "trophyId", 699136563);
        setIntField(term271641, term271641.getClass(), "cardId", 147252551);
        setIntField(term271641, term271641.getClass(), "characterId", 341079997);
        setIntField(term271641, term271641.getClass(), "characterVoiceNo", 1704594619);
        setIntField(term271641, term271641.getClass(), "tabSetting", -1621997613);
        setIntField(term271641, term271641.getClass(), "tabSortSetting", 194498105);
        setIntField(term271641, term271641.getClass(), "cardCategorySetting", 228119722);
        setIntField(term271641, term271641.getClass(), "cardSortSetting", 1712935684);
        setIntField(term271641, term271641.getClass(), "rivalScoreCategorySetting", -1167014426);
        setIntField(term271641, term271641.getClass(), "playedTutorialBit", -1186828963);
        setIntField(term271641, term271641.getClass(), "firstTutorialCancelNum", -1632065019);
        setLongField(term271641, term271641.getClass(), "sumTechHighScore", 4577752973261654109L);
        setLongField(term271641, term271641.getClass(), "sumTechBasicHighScore", 6618700949721344734L);
        setLongField(term271641, term271641.getClass(), "sumTechAdvancedHighScore", 6717372019266801331L);
        setLongField(term271641, term271641.getClass(), "sumTechExpertHighScore", 7385820717788373355L);
        setLongField(term271641, term271641.getClass(), "sumTechMasterHighScore", -215484481109717744L);
        setLongField(term271641, term271641.getClass(), "sumTechLunaticHighScore", -1506368776495026917L);
        setLongField(term271641, term271641.getClass(), "sumBattleHighScore", 2465961262685222353L);
        setLongField(term271641, term271641.getClass(), "sumBattleBasicHighScore", 2343698491462329000L);
        setLongField(term271641, term271641.getClass(), "sumBattleAdvancedHighScore", -8239722676735134543L);
        setLongField(term271641, term271641.getClass(), "sumBattleExpertHighScore", -8416265007321630691L);
        setLongField(term271641, term271641.getClass(), "sumBattleMasterHighScore", 6062531533019938891L);
        setLongField(term271641, term271641.getClass(), "sumBattleLunaticHighScore", -7433232326757884923L);
        setField(term271641, term271641.getClass(), "eventWatchedDate", "zcGiKFmqHK");
        setField(term271641, term271641.getClass(), "cmEventWatchedDate", "OmdQpmJnZl");
        setField(term271641, term271641.getClass(), "firstGameId", "fETlboOXMD");
        setField(term271641, term271641.getClass(), "firstRomVersion", "VUNSRpHsgz");
        setField(term271641, term271641.getClass(), "firstDataVersion", "THoPgbPYUF");
        setField(term271641, term271641.getClass(), "firstPlayDate", "FLJqMgPbQm");
        setField(term271641, term271641.getClass(), "lastGameId", "npMxjCfNPy");
        setField(term271641, term271641.getClass(), "lastRomVersion", "skQRylzRMg");
        setField(term271641, term271641.getClass(), "lastDataVersion", "PwmioJcxYU");
        setField(term271641, term271641.getClass(), "compatibleCmVersion", "wkgBbdahBJ");
        setField(term271641, term271641.getClass(), "lastPlayDate", "TIOKoSkgvB");
        setIntField(term271641, term271641.getClass(), "lastPlaceId", 376145605);
        setField(term271641, term271641.getClass(), "lastPlaceName", "klYAJTFSIk");
        setIntField(term271641, term271641.getClass(), "lastRegionId", -2056990359);
        setField(term271641, term271641.getClass(), "lastRegionName", "YLhafUDZSf");
        setIntField(term271641, term271641.getClass(), "lastAllNetId", 470753899);
        setField(term271641, term271641.getClass(), "lastClientId", "NkqVectDCd");
        setIntField(term271641, term271641.getClass(), "lastUsedDeckId", -969245918);
        setIntField(term271641, term271641.getClass(), "lastPlayMusicLevel", -463956795);
        setIntField(term271641, term271641.getClass(), "lastEmoneyBrand", -1133440031);
        setField(term271639, term271639.getClass(), "user", term271641);
        setField(term271639, term271639.getClass(), "authKey", "PAiEsxsOUA");
        setIntField(term271639, term271639.getClass(), "kopId", -188396386);
        setIntField(term271639, term271639.getClass(), "areaId", -288980551);
        setIntField(term271639, term271639.getClass(), "totalTechScore", 670193441);
        setIntField(term271639, term271639.getClass(), "totalPlatinumScore", 1084480415);
        setField(term271639, term271639.getClass(), "techRecordDate", "YKgbVyVpIQ");
        setBooleanField(term271639, term271639.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term271639, args);
    }

};


