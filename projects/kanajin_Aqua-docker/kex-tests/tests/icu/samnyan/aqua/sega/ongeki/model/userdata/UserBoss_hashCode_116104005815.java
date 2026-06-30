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

public class UserBoss_hashCode_116104005815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140591;

    public UserBoss_hashCode_116104005815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140597 = new Long(-7709317346333670618L);
        term140591 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term140593 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term140595 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140616 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140626 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140591, term140591.getClass(), "id", -217619108314897144L);
        setLongField(term140593, term140593.getClass(), "id", 7473201763418573799L);
        setLongField(term140595, term140595.getClass(), "id", 3776312402226864579L);
        setField(term140595, term140595.getClass(), "extId", term140597);
        setField(term140595, term140595.getClass(), "luid", "qxFCCLLOPc");
        setIntField(term140612, term140612.getClass(), "year", 2016);
        setShortField(term140612, term140612.getClass(), "month", (short) 9);
        setShortField(term140612, term140612.getClass(), "day", (short) 8);
        setField(term140611, term140611.getClass(), "date", term140612);
        setByteField(term140616, term140616.getClass(), "hour", (byte) 12);
        setByteField(term140616, term140616.getClass(), "minute", (byte) 9);
        setByteField(term140616, term140616.getClass(), "second", (byte) 23);
        setIntField(term140616, term140616.getClass(), "nano", 697344055);
        setField(term140611, term140611.getClass(), "time", term140616);
        setField(term140595, term140595.getClass(), "registerTime", term140611);
        setIntField(term140622, term140622.getClass(), "year", 2023);
        setShortField(term140622, term140622.getClass(), "month", (short) 12);
        setShortField(term140622, term140622.getClass(), "day", (short) 19);
        setField(term140621, term140621.getClass(), "date", term140622);
        setByteField(term140626, term140626.getClass(), "hour", (byte) 20);
        setByteField(term140626, term140626.getClass(), "minute", (byte) 30);
        setByteField(term140626, term140626.getClass(), "second", (byte) 13);
        setIntField(term140626, term140626.getClass(), "nano", 525415298);
        setField(term140621, term140621.getClass(), "time", term140626);
        setField(term140595, term140595.getClass(), "accessTime", term140621);
        setField(term140593, term140593.getClass(), "card", term140595);
        setField(term140593, term140593.getClass(), "userName", "jRzPtIZZPq");
        setIntField(term140593, term140593.getClass(), "level", 1084651639);
        setIntField(term140593, term140593.getClass(), "reincarnationNum", -5960347);
        setLongField(term140593, term140593.getClass(), "exp", -4775576855023197327L);
        setLongField(term140593, term140593.getClass(), "point", 4532535316576815071L);
        setLongField(term140593, term140593.getClass(), "totalPoint", -7906762485752278914L);
        setIntField(term140593, term140593.getClass(), "playCount", 1080022248);
        setIntField(term140593, term140593.getClass(), "jewelCount", -1800860642);
        setIntField(term140593, term140593.getClass(), "totalJewelCount", -1679309135);
        setIntField(term140593, term140593.getClass(), "medalCount", 1736740178);
        setIntField(term140593, term140593.getClass(), "playerRating", -202034601);
        setIntField(term140593, term140593.getClass(), "highestRating", -151407958);
        setIntField(term140593, term140593.getClass(), "battlePoint", 1537567964);
        setIntField(term140593, term140593.getClass(), "bestBattlePoint", 1552192679);
        setIntField(term140593, term140593.getClass(), "overDamageBattlePoint", -655599823);
        setBooleanField(term140593, term140593.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term140593, term140593.getClass(), "nameplateId", -1993642452);
        setIntField(term140593, term140593.getClass(), "trophyId", 1461590652);
        setIntField(term140593, term140593.getClass(), "cardId", -1671428336);
        setIntField(term140593, term140593.getClass(), "characterId", -1465646058);
        setIntField(term140593, term140593.getClass(), "characterVoiceNo", 457823846);
        setIntField(term140593, term140593.getClass(), "tabSetting", 1778294369);
        setIntField(term140593, term140593.getClass(), "tabSortSetting", -1206831454);
        setIntField(term140593, term140593.getClass(), "cardCategorySetting", 1513524215);
        setIntField(term140593, term140593.getClass(), "cardSortSetting", 86829253);
        setIntField(term140593, term140593.getClass(), "rivalScoreCategorySetting", 1622273215);
        setIntField(term140593, term140593.getClass(), "playedTutorialBit", 2023282992);
        setIntField(term140593, term140593.getClass(), "firstTutorialCancelNum", -854998820);
        setLongField(term140593, term140593.getClass(), "sumTechHighScore", -6605441472272191683L);
        setLongField(term140593, term140593.getClass(), "sumTechBasicHighScore", 8088284166559084289L);
        setLongField(term140593, term140593.getClass(), "sumTechAdvancedHighScore", -7178223697540982347L);
        setLongField(term140593, term140593.getClass(), "sumTechExpertHighScore", -6798636111214842001L);
        setLongField(term140593, term140593.getClass(), "sumTechMasterHighScore", -4598806486146386887L);
        setLongField(term140593, term140593.getClass(), "sumTechLunaticHighScore", 8801726369287370368L);
        setLongField(term140593, term140593.getClass(), "sumBattleHighScore", 886258709475362362L);
        setLongField(term140593, term140593.getClass(), "sumBattleBasicHighScore", 5913522470719108407L);
        setLongField(term140593, term140593.getClass(), "sumBattleAdvancedHighScore", -3887130051944385718L);
        setLongField(term140593, term140593.getClass(), "sumBattleExpertHighScore", 3554279999347113248L);
        setLongField(term140593, term140593.getClass(), "sumBattleMasterHighScore", 4286268778069095170L);
        setLongField(term140593, term140593.getClass(), "sumBattleLunaticHighScore", 3778688161546720472L);
        setField(term140593, term140593.getClass(), "eventWatchedDate", "jWLMtLmajF");
        setField(term140593, term140593.getClass(), "cmEventWatchedDate", "yilQWbXHUb");
        setField(term140593, term140593.getClass(), "firstGameId", "gVcKciUjfM");
        setField(term140593, term140593.getClass(), "firstRomVersion", "QaVgtUzVJm");
        setField(term140593, term140593.getClass(), "firstDataVersion", "siJZKpfTHw");
        setField(term140593, term140593.getClass(), "firstPlayDate", "YPFFWDNfXT");
        setField(term140593, term140593.getClass(), "lastGameId", "QrnjkRvNan");
        setField(term140593, term140593.getClass(), "lastRomVersion", "TZfRFyUTAy");
        setField(term140593, term140593.getClass(), "lastDataVersion", "fDBSbnZQEb");
        setField(term140593, term140593.getClass(), "compatibleCmVersion", "eWwifIiXBf");
        setField(term140593, term140593.getClass(), "lastPlayDate", "WeglJEjdLT");
        setIntField(term140593, term140593.getClass(), "lastPlaceId", 1361637334);
        setField(term140593, term140593.getClass(), "lastPlaceName", "BCHkdVYkdA");
        setIntField(term140593, term140593.getClass(), "lastRegionId", 640213918);
        setField(term140593, term140593.getClass(), "lastRegionName", "jKLqoDVqyY");
        setIntField(term140593, term140593.getClass(), "lastAllNetId", -1683063075);
        setField(term140593, term140593.getClass(), "lastClientId", "nXxhbinfxu");
        setIntField(term140593, term140593.getClass(), "lastUsedDeckId", 1391093985);
        setIntField(term140593, term140593.getClass(), "lastPlayMusicLevel", -1936658953);
        setIntField(term140593, term140593.getClass(), "lastEmoneyBrand", 758083956);
        setField(term140591, term140591.getClass(), "user", term140593);
        setIntField(term140591, term140591.getClass(), "musicId", 82402802);
        setIntField(term140591, term140591.getClass(), "damage", 83591041);
        setBooleanField(term140591, term140591.getClass(), "isClear", false);
        setIntField(term140591, term140591.getClass(), "eventId", 149454673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term140591, args);
    }

};


