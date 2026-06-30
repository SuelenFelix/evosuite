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

public class UserMusicDetail_isStoryWatched_149693364518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411668;

    public UserMusicDetail_isStoryWatched_149693364518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411674 = new Long(-6151316713456472560L);
        term411668 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term411670 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term411672 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term411688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term411693 = newInstance(Class.forName("java.time.LocalTime"));
        Object term411698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term411703 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term411668, term411668.getClass(), "id", 2173841757053309004L);
        setLongField(term411670, term411670.getClass(), "id", 6401051327599477407L);
        setLongField(term411672, term411672.getClass(), "id", -3191049865453803215L);
        setField(term411672, term411672.getClass(), "extId", term411674);
        setField(term411672, term411672.getClass(), "luid", "KtyOVoQnYN");
        setIntField(term411689, term411689.getClass(), "year", 2026);
        setShortField(term411689, term411689.getClass(), "month", (short) 8);
        setShortField(term411689, term411689.getClass(), "day", (short) 2);
        setField(term411688, term411688.getClass(), "date", term411689);
        setByteField(term411693, term411693.getClass(), "hour", (byte) 21);
        setByteField(term411693, term411693.getClass(), "minute", (byte) 44);
        setByteField(term411693, term411693.getClass(), "second", (byte) 5);
        setIntField(term411693, term411693.getClass(), "nano", 468273164);
        setField(term411688, term411688.getClass(), "time", term411693);
        setField(term411672, term411672.getClass(), "registerTime", term411688);
        setIntField(term411699, term411699.getClass(), "year", 2017);
        setShortField(term411699, term411699.getClass(), "month", (short) 3);
        setShortField(term411699, term411699.getClass(), "day", (short) 12);
        setField(term411698, term411698.getClass(), "date", term411699);
        setByteField(term411703, term411703.getClass(), "hour", (byte) 7);
        setByteField(term411703, term411703.getClass(), "minute", (byte) 19);
        setByteField(term411703, term411703.getClass(), "second", (byte) 13);
        setIntField(term411703, term411703.getClass(), "nano", 859133326);
        setField(term411698, term411698.getClass(), "time", term411703);
        setField(term411672, term411672.getClass(), "accessTime", term411698);
        setField(term411670, term411670.getClass(), "card", term411672);
        setField(term411670, term411670.getClass(), "userName", "mvTpdPxNUo");
        setIntField(term411670, term411670.getClass(), "level", 472852318);
        setIntField(term411670, term411670.getClass(), "reincarnationNum", 476731954);
        setLongField(term411670, term411670.getClass(), "exp", 198594267564904326L);
        setLongField(term411670, term411670.getClass(), "point", 4413694577249991128L);
        setLongField(term411670, term411670.getClass(), "totalPoint", 8238799625333743619L);
        setIntField(term411670, term411670.getClass(), "playCount", 303615238);
        setIntField(term411670, term411670.getClass(), "jewelCount", 1508986254);
        setIntField(term411670, term411670.getClass(), "totalJewelCount", 1452352586);
        setIntField(term411670, term411670.getClass(), "medalCount", 519743302);
        setIntField(term411670, term411670.getClass(), "playerRating", -2075447848);
        setIntField(term411670, term411670.getClass(), "highestRating", -1903788058);
        setIntField(term411670, term411670.getClass(), "battlePoint", 1384263349);
        setIntField(term411670, term411670.getClass(), "bestBattlePoint", -1134707056);
        setIntField(term411670, term411670.getClass(), "overDamageBattlePoint", -1264825992);
        setBooleanField(term411670, term411670.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term411670, term411670.getClass(), "nameplateId", -554856538);
        setIntField(term411670, term411670.getClass(), "trophyId", 134467698);
        setIntField(term411670, term411670.getClass(), "cardId", -1045867805);
        setIntField(term411670, term411670.getClass(), "characterId", -1819582530);
        setIntField(term411670, term411670.getClass(), "characterVoiceNo", 1939773291);
        setIntField(term411670, term411670.getClass(), "tabSetting", -2123548281);
        setIntField(term411670, term411670.getClass(), "tabSortSetting", -1501829531);
        setIntField(term411670, term411670.getClass(), "cardCategorySetting", 1265556490);
        setIntField(term411670, term411670.getClass(), "cardSortSetting", 1394602253);
        setIntField(term411670, term411670.getClass(), "rivalScoreCategorySetting", -318658528);
        setIntField(term411670, term411670.getClass(), "playedTutorialBit", -1738783376);
        setIntField(term411670, term411670.getClass(), "firstTutorialCancelNum", -491487149);
        setLongField(term411670, term411670.getClass(), "sumTechHighScore", 6745703176595847065L);
        setLongField(term411670, term411670.getClass(), "sumTechBasicHighScore", -1861570730684690495L);
        setLongField(term411670, term411670.getClass(), "sumTechAdvancedHighScore", -7829714155702753830L);
        setLongField(term411670, term411670.getClass(), "sumTechExpertHighScore", -9056178451018942479L);
        setLongField(term411670, term411670.getClass(), "sumTechMasterHighScore", -3285142858858216817L);
        setLongField(term411670, term411670.getClass(), "sumTechLunaticHighScore", 658468831839639917L);
        setLongField(term411670, term411670.getClass(), "sumBattleHighScore", 6143731772208215812L);
        setLongField(term411670, term411670.getClass(), "sumBattleBasicHighScore", 3108185780673103136L);
        setLongField(term411670, term411670.getClass(), "sumBattleAdvancedHighScore", 7796397518295945433L);
        setLongField(term411670, term411670.getClass(), "sumBattleExpertHighScore", -6847238340813887836L);
        setLongField(term411670, term411670.getClass(), "sumBattleMasterHighScore", -1293585536994588850L);
        setLongField(term411670, term411670.getClass(), "sumBattleLunaticHighScore", 1932308171742909740L);
        setField(term411670, term411670.getClass(), "eventWatchedDate", "sJaKxpxGma");
        setField(term411670, term411670.getClass(), "cmEventWatchedDate", "LKRGfagaYo");
        setField(term411670, term411670.getClass(), "firstGameId", "lNfxFlyosd");
        setField(term411670, term411670.getClass(), "firstRomVersion", "SAleRutAJR");
        setField(term411670, term411670.getClass(), "firstDataVersion", "dumVpTLErH");
        setField(term411670, term411670.getClass(), "firstPlayDate", "BUmoTnhCZg");
        setField(term411670, term411670.getClass(), "lastGameId", "rzgVohwGGp");
        setField(term411670, term411670.getClass(), "lastRomVersion", "uWTpiLoCgI");
        setField(term411670, term411670.getClass(), "lastDataVersion", "LMKuRMqTSj");
        setField(term411670, term411670.getClass(), "compatibleCmVersion", "yzyxeWmxlw");
        setField(term411670, term411670.getClass(), "lastPlayDate", "lRBHJGRmhJ");
        setIntField(term411670, term411670.getClass(), "lastPlaceId", 746358052);
        setField(term411670, term411670.getClass(), "lastPlaceName", "tfAIZXLwFv");
        setIntField(term411670, term411670.getClass(), "lastRegionId", -495920186);
        setField(term411670, term411670.getClass(), "lastRegionName", "tVxrapJjXT");
        setIntField(term411670, term411670.getClass(), "lastAllNetId", -975483972);
        setField(term411670, term411670.getClass(), "lastClientId", "uKUqlKyaMf");
        setIntField(term411670, term411670.getClass(), "lastUsedDeckId", -2054115969);
        setIntField(term411670, term411670.getClass(), "lastPlayMusicLevel", -1219424563);
        setIntField(term411670, term411670.getClass(), "lastEmoneyBrand", -1542518832);
        setField(term411668, term411668.getClass(), "user", term411670);
        setIntField(term411668, term411668.getClass(), "musicId", -2111154243);
        setIntField(term411668, term411668.getClass(), "level", -253141772);
        setIntField(term411668, term411668.getClass(), "playCount", -1031579730);
        setIntField(term411668, term411668.getClass(), "techScoreMax", -831194855);
        setIntField(term411668, term411668.getClass(), "techScoreRank", -937750455);
        setIntField(term411668, term411668.getClass(), "battleScoreMax", 1878957934);
        setIntField(term411668, term411668.getClass(), "battleScoreRank", 1516417078);
        setIntField(term411668, term411668.getClass(), "maxComboCount", -1760533773);
        setIntField(term411668, term411668.getClass(), "maxOverKill", 195256445);
        setIntField(term411668, term411668.getClass(), "maxTeamOverKill", -1810123501);
        setBooleanField(term411668, term411668.getClass(), "isFullBell", true);
        setBooleanField(term411668, term411668.getClass(), "isFullCombo", false);
        setBooleanField(term411668, term411668.getClass(), "isAllBreake", true);
        setBooleanField(term411668, term411668.getClass(), "isLock", true);
        setIntField(term411668, term411668.getClass(), "clearStatus", -1524553687);
        setBooleanField(term411668, term411668.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStoryWatched", argTypes, term411668, args);
    }

};


