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

public class UserOption_getVolDamage_33629284921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318153;

    public UserOption_getVolDamage_33629284921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318159 = new Long(-6314099457945626605L);
        term318153 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term318155 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term318157 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term318173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318178 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318188 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term318153, term318153.getClass(), "id", -6598936257351203088L);
        setLongField(term318155, term318155.getClass(), "id", 1898423963954477651L);
        setLongField(term318157, term318157.getClass(), "id", -3596951021669807919L);
        setField(term318157, term318157.getClass(), "extId", term318159);
        setField(term318157, term318157.getClass(), "luid", "pWTTxYyErO");
        setIntField(term318174, term318174.getClass(), "year", 2027);
        setShortField(term318174, term318174.getClass(), "month", (short) 4);
        setShortField(term318174, term318174.getClass(), "day", (short) 17);
        setField(term318173, term318173.getClass(), "date", term318174);
        setByteField(term318178, term318178.getClass(), "hour", (byte) 18);
        setByteField(term318178, term318178.getClass(), "minute", (byte) 31);
        setByteField(term318178, term318178.getClass(), "second", (byte) 18);
        setIntField(term318178, term318178.getClass(), "nano", 163095528);
        setField(term318173, term318173.getClass(), "time", term318178);
        setField(term318157, term318157.getClass(), "registerTime", term318173);
        setIntField(term318184, term318184.getClass(), "year", 2021);
        setShortField(term318184, term318184.getClass(), "month", (short) 4);
        setShortField(term318184, term318184.getClass(), "day", (short) 19);
        setField(term318183, term318183.getClass(), "date", term318184);
        setByteField(term318188, term318188.getClass(), "hour", (byte) 3);
        setByteField(term318188, term318188.getClass(), "minute", (byte) 50);
        setByteField(term318188, term318188.getClass(), "second", (byte) 53);
        setIntField(term318188, term318188.getClass(), "nano", 269331125);
        setField(term318183, term318183.getClass(), "time", term318188);
        setField(term318157, term318157.getClass(), "accessTime", term318183);
        setField(term318155, term318155.getClass(), "card", term318157);
        setField(term318155, term318155.getClass(), "userName", "CCcfRCqCEI");
        setIntField(term318155, term318155.getClass(), "level", 1200208377);
        setIntField(term318155, term318155.getClass(), "reincarnationNum", -1888267911);
        setLongField(term318155, term318155.getClass(), "exp", -3708955417570095226L);
        setLongField(term318155, term318155.getClass(), "point", -1526882206342901058L);
        setLongField(term318155, term318155.getClass(), "totalPoint", -4309974324965720265L);
        setIntField(term318155, term318155.getClass(), "playCount", 937270005);
        setIntField(term318155, term318155.getClass(), "jewelCount", -986109363);
        setIntField(term318155, term318155.getClass(), "totalJewelCount", 188098982);
        setIntField(term318155, term318155.getClass(), "medalCount", 1669878789);
        setIntField(term318155, term318155.getClass(), "playerRating", 1550968020);
        setIntField(term318155, term318155.getClass(), "highestRating", 1622874580);
        setIntField(term318155, term318155.getClass(), "battlePoint", -646133596);
        setIntField(term318155, term318155.getClass(), "bestBattlePoint", 914143935);
        setIntField(term318155, term318155.getClass(), "overDamageBattlePoint", 1200909031);
        setBooleanField(term318155, term318155.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term318155, term318155.getClass(), "nameplateId", 2098217272);
        setIntField(term318155, term318155.getClass(), "trophyId", -1010918916);
        setIntField(term318155, term318155.getClass(), "cardId", 549900835);
        setIntField(term318155, term318155.getClass(), "characterId", 1760648398);
        setIntField(term318155, term318155.getClass(), "characterVoiceNo", -302488777);
        setIntField(term318155, term318155.getClass(), "tabSetting", 1755769273);
        setIntField(term318155, term318155.getClass(), "tabSortSetting", 98717406);
        setIntField(term318155, term318155.getClass(), "cardCategorySetting", -482421925);
        setIntField(term318155, term318155.getClass(), "cardSortSetting", -1730884605);
        setIntField(term318155, term318155.getClass(), "rivalScoreCategorySetting", 1283823002);
        setIntField(term318155, term318155.getClass(), "playedTutorialBit", 1845688941);
        setIntField(term318155, term318155.getClass(), "firstTutorialCancelNum", 597404261);
        setLongField(term318155, term318155.getClass(), "sumTechHighScore", -1257869433279300025L);
        setLongField(term318155, term318155.getClass(), "sumTechBasicHighScore", -8650282471702518369L);
        setLongField(term318155, term318155.getClass(), "sumTechAdvancedHighScore", 7473155210893500280L);
        setLongField(term318155, term318155.getClass(), "sumTechExpertHighScore", -116876754854791569L);
        setLongField(term318155, term318155.getClass(), "sumTechMasterHighScore", 3790099500945590366L);
        setLongField(term318155, term318155.getClass(), "sumTechLunaticHighScore", 3768739913377011184L);
        setLongField(term318155, term318155.getClass(), "sumBattleHighScore", -3621281825392049975L);
        setLongField(term318155, term318155.getClass(), "sumBattleBasicHighScore", -8871513786479714196L);
        setLongField(term318155, term318155.getClass(), "sumBattleAdvancedHighScore", -545371412619479470L);
        setLongField(term318155, term318155.getClass(), "sumBattleExpertHighScore", -2675351862316104756L);
        setLongField(term318155, term318155.getClass(), "sumBattleMasterHighScore", 8955878821403699359L);
        setLongField(term318155, term318155.getClass(), "sumBattleLunaticHighScore", 6542840494582730626L);
        setField(term318155, term318155.getClass(), "eventWatchedDate", "YRVWwlwvuz");
        setField(term318155, term318155.getClass(), "cmEventWatchedDate", "PCVZZfNDzA");
        setField(term318155, term318155.getClass(), "firstGameId", "kyWmJbtPfx");
        setField(term318155, term318155.getClass(), "firstRomVersion", "gQWUlAtJDw");
        setField(term318155, term318155.getClass(), "firstDataVersion", "UnJDAYHVNu");
        setField(term318155, term318155.getClass(), "firstPlayDate", "srliSRcrzg");
        setField(term318155, term318155.getClass(), "lastGameId", "odkRikRcOr");
        setField(term318155, term318155.getClass(), "lastRomVersion", "MutJLhZOKV");
        setField(term318155, term318155.getClass(), "lastDataVersion", "fQGkkfpUJA");
        setField(term318155, term318155.getClass(), "compatibleCmVersion", "OxSOYuptXE");
        setField(term318155, term318155.getClass(), "lastPlayDate", "RyPKGlJxoD");
        setIntField(term318155, term318155.getClass(), "lastPlaceId", -953186162);
        setField(term318155, term318155.getClass(), "lastPlaceName", "UYhShQHDYZ");
        setIntField(term318155, term318155.getClass(), "lastRegionId", 1664658690);
        setField(term318155, term318155.getClass(), "lastRegionName", "PhgVfDZrPc");
        setIntField(term318155, term318155.getClass(), "lastAllNetId", 825427459);
        setField(term318155, term318155.getClass(), "lastClientId", "AtpMHXaorX");
        setIntField(term318155, term318155.getClass(), "lastUsedDeckId", 505521116);
        setIntField(term318155, term318155.getClass(), "lastPlayMusicLevel", -353874424);
        setIntField(term318155, term318155.getClass(), "lastEmoneyBrand", -721707981);
        setField(term318153, term318153.getClass(), "user", term318155);
        setIntField(term318153, term318153.getClass(), "optionSet", 1346971567);
        setIntField(term318153, term318153.getClass(), "speed", -502388706);
        setIntField(term318153, term318153.getClass(), "mirror", 1976161701);
        setIntField(term318153, term318153.getClass(), "judgeTiming", -1977526597);
        setIntField(term318153, term318153.getClass(), "judgeAdjustment", 1883301310);
        setIntField(term318153, term318153.getClass(), "abort", -1438238840);
        setIntField(term318153, term318153.getClass(), "stealthField", 2033365155);
        setIntField(term318153, term318153.getClass(), "tapSound", -1071499987);
        setIntField(term318153, term318153.getClass(), "volGuide", 1078047837);
        setIntField(term318153, term318153.getClass(), "volAll", 1043292494);
        setIntField(term318153, term318153.getClass(), "volTap", 866703499);
        setIntField(term318153, term318153.getClass(), "volCrTap", -608339436);
        setIntField(term318153, term318153.getClass(), "volHold", 944228739);
        setIntField(term318153, term318153.getClass(), "volSide", -601828465);
        setIntField(term318153, term318153.getClass(), "volFlick", -1579188298);
        setIntField(term318153, term318153.getClass(), "volBell", 326742565);
        setIntField(term318153, term318153.getClass(), "volEnemy", 1345047309);
        setIntField(term318153, term318153.getClass(), "volSkill", -817047389);
        setIntField(term318153, term318153.getClass(), "volDamage", 2066408978);
        setIntField(term318153, term318153.getClass(), "colorField", 449733555);
        setIntField(term318153, term318153.getClass(), "colorLaneBright", -1426801879);
        setIntField(term318153, term318153.getClass(), "colorWallBright", -1607182921);
        setIntField(term318153, term318153.getClass(), "colorLane", -1630128602);
        setIntField(term318153, term318153.getClass(), "colorSide", 200589671);
        setIntField(term318153, term318153.getClass(), "effectDamage", 2066859768);
        setIntField(term318153, term318153.getClass(), "effectPos", -1246028132);
        setIntField(term318153, term318153.getClass(), "judgeDisp", 210480723);
        setIntField(term318153, term318153.getClass(), "judgePos", -1006349265);
        setIntField(term318153, term318153.getClass(), "judgeBreak", 1087363951);
        setIntField(term318153, term318153.getClass(), "judgeHit", -2029178149);
        setIntField(term318153, term318153.getClass(), "platinumBreakDisp", -1103127972);
        setIntField(term318153, term318153.getClass(), "judgeCriticalBreak", 1172033654);
        setIntField(term318153, term318153.getClass(), "matching", -1179048835);
        setIntField(term318153, term318153.getClass(), "dispPlayerLv", -923650036);
        setIntField(term318153, term318153.getClass(), "dispRating", -1844256473);
        setIntField(term318153, term318153.getClass(), "dispBP", -2086303082);
        setIntField(term318153, term318153.getClass(), "headphone", -1563764110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolDamage", argTypes, term318153, args);
    }

};


