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

public class UserBoss_canEqual_9180924614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140161;
     Object term140430;

    public UserBoss_canEqual_9180924614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140167 = new Long(-1481367303699139651L);
        term140161 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term140163 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term140165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140196 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140161, term140161.getClass(), "id", -8937899652131805213L);
        setLongField(term140163, term140163.getClass(), "id", 4693573205934913507L);
        setLongField(term140165, term140165.getClass(), "id", 5332734688698602505L);
        setField(term140165, term140165.getClass(), "extId", term140167);
        setField(term140165, term140165.getClass(), "luid", "mywuLwqGWK");
        setIntField(term140182, term140182.getClass(), "year", 2024);
        setShortField(term140182, term140182.getClass(), "month", (short) 1);
        setShortField(term140182, term140182.getClass(), "day", (short) 9);
        setField(term140181, term140181.getClass(), "date", term140182);
        setByteField(term140186, term140186.getClass(), "hour", (byte) 16);
        setByteField(term140186, term140186.getClass(), "minute", (byte) 51);
        setByteField(term140186, term140186.getClass(), "second", (byte) 43);
        setIntField(term140186, term140186.getClass(), "nano", 661225347);
        setField(term140181, term140181.getClass(), "time", term140186);
        setField(term140165, term140165.getClass(), "registerTime", term140181);
        setIntField(term140192, term140192.getClass(), "year", 2014);
        setShortField(term140192, term140192.getClass(), "month", (short) 6);
        setShortField(term140192, term140192.getClass(), "day", (short) 7);
        setField(term140191, term140191.getClass(), "date", term140192);
        setByteField(term140196, term140196.getClass(), "hour", (byte) 23);
        setByteField(term140196, term140196.getClass(), "minute", (byte) 34);
        setByteField(term140196, term140196.getClass(), "second", (byte) 36);
        setIntField(term140196, term140196.getClass(), "nano", 967981946);
        setField(term140191, term140191.getClass(), "time", term140196);
        setField(term140165, term140165.getClass(), "accessTime", term140191);
        setField(term140163, term140163.getClass(), "card", term140165);
        setField(term140163, term140163.getClass(), "userName", "ZySPRbJHwO");
        setIntField(term140163, term140163.getClass(), "level", -108342419);
        setIntField(term140163, term140163.getClass(), "reincarnationNum", -2084652820);
        setLongField(term140163, term140163.getClass(), "exp", -7895788691931754661L);
        setLongField(term140163, term140163.getClass(), "point", 292806100126951541L);
        setLongField(term140163, term140163.getClass(), "totalPoint", 8210060061385705911L);
        setIntField(term140163, term140163.getClass(), "playCount", -1596509485);
        setIntField(term140163, term140163.getClass(), "jewelCount", 1787629634);
        setIntField(term140163, term140163.getClass(), "totalJewelCount", 746589330);
        setIntField(term140163, term140163.getClass(), "medalCount", -2087341902);
        setIntField(term140163, term140163.getClass(), "playerRating", -1552395095);
        setIntField(term140163, term140163.getClass(), "highestRating", 1119787944);
        setIntField(term140163, term140163.getClass(), "battlePoint", 2099414259);
        setIntField(term140163, term140163.getClass(), "bestBattlePoint", 1080055407);
        setIntField(term140163, term140163.getClass(), "overDamageBattlePoint", -880340280);
        setBooleanField(term140163, term140163.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term140163, term140163.getClass(), "nameplateId", -1194222550);
        setIntField(term140163, term140163.getClass(), "trophyId", 566167796);
        setIntField(term140163, term140163.getClass(), "cardId", -1082962860);
        setIntField(term140163, term140163.getClass(), "characterId", 1200402655);
        setIntField(term140163, term140163.getClass(), "characterVoiceNo", -1500378498);
        setIntField(term140163, term140163.getClass(), "tabSetting", -1429162976);
        setIntField(term140163, term140163.getClass(), "tabSortSetting", 1773815133);
        setIntField(term140163, term140163.getClass(), "cardCategorySetting", -1518311473);
        setIntField(term140163, term140163.getClass(), "cardSortSetting", 1910611561);
        setIntField(term140163, term140163.getClass(), "rivalScoreCategorySetting", -141028019);
        setIntField(term140163, term140163.getClass(), "playedTutorialBit", -2084912991);
        setIntField(term140163, term140163.getClass(), "firstTutorialCancelNum", -374431639);
        setLongField(term140163, term140163.getClass(), "sumTechHighScore", -1937271832570903690L);
        setLongField(term140163, term140163.getClass(), "sumTechBasicHighScore", -7420398268565792101L);
        setLongField(term140163, term140163.getClass(), "sumTechAdvancedHighScore", -7788615983078043573L);
        setLongField(term140163, term140163.getClass(), "sumTechExpertHighScore", -3261190698438902901L);
        setLongField(term140163, term140163.getClass(), "sumTechMasterHighScore", -6622046666097804278L);
        setLongField(term140163, term140163.getClass(), "sumTechLunaticHighScore", 4822852775290078569L);
        setLongField(term140163, term140163.getClass(), "sumBattleHighScore", 2148831006396667074L);
        setLongField(term140163, term140163.getClass(), "sumBattleBasicHighScore", 8170093137938816572L);
        setLongField(term140163, term140163.getClass(), "sumBattleAdvancedHighScore", 301807496271591139L);
        setLongField(term140163, term140163.getClass(), "sumBattleExpertHighScore", -7965247812461560014L);
        setLongField(term140163, term140163.getClass(), "sumBattleMasterHighScore", 2171144008274324702L);
        setLongField(term140163, term140163.getClass(), "sumBattleLunaticHighScore", -6112705173113121049L);
        setField(term140163, term140163.getClass(), "eventWatchedDate", "qVZzWMIpdZ");
        setField(term140163, term140163.getClass(), "cmEventWatchedDate", "RVyPHqsjIQ");
        setField(term140163, term140163.getClass(), "firstGameId", "HInKycRClK");
        setField(term140163, term140163.getClass(), "firstRomVersion", "ovWYiKLJPi");
        setField(term140163, term140163.getClass(), "firstDataVersion", "KqOycFiFAf");
        setField(term140163, term140163.getClass(), "firstPlayDate", "pBstCdjkMe");
        setField(term140163, term140163.getClass(), "lastGameId", "BpLdpzfuoW");
        setField(term140163, term140163.getClass(), "lastRomVersion", "rkzpRpPNtv");
        setField(term140163, term140163.getClass(), "lastDataVersion", "xWbVCwRARi");
        setField(term140163, term140163.getClass(), "compatibleCmVersion", "WNZjPUZVwT");
        setField(term140163, term140163.getClass(), "lastPlayDate", "RrHlTUwGAK");
        setIntField(term140163, term140163.getClass(), "lastPlaceId", -1331172307);
        setField(term140163, term140163.getClass(), "lastPlaceName", "HnGWMIfZqD");
        setIntField(term140163, term140163.getClass(), "lastRegionId", 2092822782);
        setField(term140163, term140163.getClass(), "lastRegionName", "wzcInEwTXc");
        setIntField(term140163, term140163.getClass(), "lastAllNetId", 1740023276);
        setField(term140163, term140163.getClass(), "lastClientId", "GpvNlGeEJB");
        setIntField(term140163, term140163.getClass(), "lastUsedDeckId", 412259963);
        setIntField(term140163, term140163.getClass(), "lastPlayMusicLevel", 581068095);
        setIntField(term140163, term140163.getClass(), "lastEmoneyBrand", 1081427463);
        setField(term140161, term140161.getClass(), "user", term140163);
        setIntField(term140161, term140161.getClass(), "musicId", -276588662);
        setIntField(term140161, term140161.getClass(), "damage", 41461773);
        setBooleanField(term140161, term140161.getClass(), "isClear", true);
        setIntField(term140161, term140161.getClass(), "eventId", 1130836028);
        term140430 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140430;
        callMethod(klass, "canEqual", argTypes, term140161, args);
    }

};


