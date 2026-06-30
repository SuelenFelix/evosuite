package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserData_setNetBattleHost_1259495402404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292830;
     Object term292907;

    public UserData_setNetBattleHost_1259495402404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292830 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292830, term292830.getClass(), "id", 0L);
        setField(term292830, term292830.getClass(), "card", null);
        setField(term292830, term292830.getClass(), "userName", null);
        setIntField(term292830, term292830.getClass(), "level", 0);
        setIntField(term292830, term292830.getClass(), "reincarnationNum", 0);
        setField(term292830, term292830.getClass(), "exp", null);
        setLongField(term292830, term292830.getClass(), "point", 0L);
        setLongField(term292830, term292830.getClass(), "totalPoint", 0L);
        setIntField(term292830, term292830.getClass(), "playCount", 0);
        setIntField(term292830, term292830.getClass(), "multiPlayCount", 0);
        setIntField(term292830, term292830.getClass(), "playerRating", 0);
        setIntField(term292830, term292830.getClass(), "highestRating", 0);
        setIntField(term292830, term292830.getClass(), "nameplateId", 0);
        setIntField(term292830, term292830.getClass(), "frameId", 0);
        setIntField(term292830, term292830.getClass(), "characterId", 0);
        setIntField(term292830, term292830.getClass(), "trophyId", 0);
        setIntField(term292830, term292830.getClass(), "playedTutorialBit", 0);
        setIntField(term292830, term292830.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292830, term292830.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292830, term292830.getClass(), "totalMapNum", 0);
        setLongField(term292830, term292830.getClass(), "totalHiScore", 0L);
        setLongField(term292830, term292830.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292830, term292830.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292830, term292830.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292830, term292830.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292830, term292830.getClass(), "totalUltimaHighScore", 0L);
        setField(term292830, term292830.getClass(), "eventWatchedDate", null);
        setIntField(term292830, term292830.getClass(), "friendCount", 0);
        setField(term292830, term292830.getClass(), "firstGameId", null);
        setField(term292830, term292830.getClass(), "firstRomVersion", null);
        setField(term292830, term292830.getClass(), "firstDataVersion", null);
        setField(term292830, term292830.getClass(), "firstPlayDate", null);
        setField(term292830, term292830.getClass(), "lastGameId", null);
        setField(term292830, term292830.getClass(), "lastRomVersion", null);
        setField(term292830, term292830.getClass(), "lastDataVersion", null);
        setField(term292830, term292830.getClass(), "lastLoginDate", null);
        setField(term292830, term292830.getClass(), "lastPlayDate", null);
        setIntField(term292830, term292830.getClass(), "lastPlaceId", 0);
        setField(term292830, term292830.getClass(), "lastPlaceName", null);
        setField(term292830, term292830.getClass(), "lastRegionId", null);
        setField(term292830, term292830.getClass(), "lastRegionName", null);
        setField(term292830, term292830.getClass(), "lastAllNetId", null);
        setField(term292830, term292830.getClass(), "lastClientId", null);
        setField(term292830, term292830.getClass(), "lastCountryCode", null);
        setField(term292830, term292830.getClass(), "userNameEx", null);
        setField(term292830, term292830.getClass(), "compatibleCmVersion", null);
        setIntField(term292830, term292830.getClass(), "medal", 0);
        setIntField(term292830, term292830.getClass(), "mapIconId", 0);
        setIntField(term292830, term292830.getClass(), "voiceId", 0);
        setIntField(term292830, term292830.getClass(), "avatarWear", 0);
        setIntField(term292830, term292830.getClass(), "avatarHead", 0);
        setIntField(term292830, term292830.getClass(), "avatarFace", 0);
        setIntField(term292830, term292830.getClass(), "avatarSkin", 0);
        setIntField(term292830, term292830.getClass(), "avatarItem", 0);
        setIntField(term292830, term292830.getClass(), "avatarFront", 0);
        setIntField(term292830, term292830.getClass(), "avatarBack", 0);
        setIntField(term292830, term292830.getClass(), "classEmblemBase", 0);
        setIntField(term292830, term292830.getClass(), "classEmblemMedal", 0);
        setIntField(term292830, term292830.getClass(), "stockedGridCount", 0);
        setIntField(term292830, term292830.getClass(), "exMapLoopCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattlePlayCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattleWinCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattleLoseCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292830, term292830.getClass(), "charaIllustId", 0);
        setIntField(term292830, term292830.getClass(), "skillId", 0);
        setIntField(term292830, term292830.getClass(), "overPowerPoint", 0);
        setIntField(term292830, term292830.getClass(), "overPowerRate", 0);
        setIntField(term292830, term292830.getClass(), "overPowerLowerRank", 0);
        setIntField(term292830, term292830.getClass(), "avatarPoint", 0);
        setIntField(term292830, term292830.getClass(), "battleRankId", 0);
        setIntField(term292830, term292830.getClass(), "battleRankPoint", 0);
        setIntField(term292830, term292830.getClass(), "eliteRankPoint", 0);
        setIntField(term292830, term292830.getClass(), "netBattle1stCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattle2ndCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattle3rdCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattle4thCount", 0);
        setIntField(term292830, term292830.getClass(), "netBattleCorrection", 0);
        setIntField(term292830, term292830.getClass(), "netBattleErrCnt", 0);
        setIntField(term292830, term292830.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292830, term292830.getClass(), "battleRewardStatus", 0);
        setIntField(term292830, term292830.getClass(), "battleRewardIndex", 0);
        setIntField(term292830, term292830.getClass(), "battleRewardCount", 0);
        setIntField(term292830, term292830.getClass(), "ext1", 0);
        setIntField(term292830, term292830.getClass(), "ext2", 0);
        setIntField(term292830, term292830.getClass(), "ext3", 0);
        setIntField(term292830, term292830.getClass(), "ext4", 0);
        setIntField(term292830, term292830.getClass(), "ext5", 0);
        setIntField(term292830, term292830.getClass(), "ext6", 0);
        setIntField(term292830, term292830.getClass(), "ext7", 0);
        setIntField(term292830, term292830.getClass(), "ext8", 0);
        setIntField(term292830, term292830.getClass(), "ext9", 0);
        setIntField(term292830, term292830.getClass(), "ext10", 0);
        setField(term292830, term292830.getClass(), "extStr1", null);
        setField(term292830, term292830.getClass(), "extStr2", null);
        setLongField(term292830, term292830.getClass(), "extLong1", 0L);
        setLongField(term292830, term292830.getClass(), "extLong2", 0L);
        setField(term292830, term292830.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292830, term292830.getClass(), "isNetBattleHost", false);
        setIntField(term292830, term292830.getClass(), "netBattleEndState", 0);
        term292907 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term292907;
        callMethod(klass, "setNetBattleHost", argTypes, term292830, args);
    }

};


