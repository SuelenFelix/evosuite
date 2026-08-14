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

public class UserData_getNetBattle4thCount_165198689283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4217889;

    public UserData_getNetBattle4thCount_165198689283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4217889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4217889, term4217889.getClass(), "id", 0L);
        setField(term4217889, term4217889.getClass(), "card", null);
        setField(term4217889, term4217889.getClass(), "userName", null);
        setIntField(term4217889, term4217889.getClass(), "level", 0);
        setIntField(term4217889, term4217889.getClass(), "reincarnationNum", 0);
        setField(term4217889, term4217889.getClass(), "exp", null);
        setLongField(term4217889, term4217889.getClass(), "point", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalPoint", 0L);
        setIntField(term4217889, term4217889.getClass(), "playCount", 0);
        setIntField(term4217889, term4217889.getClass(), "multiPlayCount", 0);
        setIntField(term4217889, term4217889.getClass(), "playerRating", 0);
        setIntField(term4217889, term4217889.getClass(), "highestRating", 0);
        setIntField(term4217889, term4217889.getClass(), "nameplateId", 0);
        setIntField(term4217889, term4217889.getClass(), "frameId", 0);
        setIntField(term4217889, term4217889.getClass(), "characterId", 0);
        setIntField(term4217889, term4217889.getClass(), "trophyId", 0);
        setIntField(term4217889, term4217889.getClass(), "playedTutorialBit", 0);
        setIntField(term4217889, term4217889.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4217889, term4217889.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4217889, term4217889.getClass(), "totalMapNum", 0);
        setLongField(term4217889, term4217889.getClass(), "totalHiScore", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4217889, term4217889.getClass(), "totalUltimaHighScore", 0L);
        setField(term4217889, term4217889.getClass(), "eventWatchedDate", null);
        setIntField(term4217889, term4217889.getClass(), "friendCount", 0);
        setField(term4217889, term4217889.getClass(), "firstGameId", null);
        setField(term4217889, term4217889.getClass(), "firstRomVersion", null);
        setField(term4217889, term4217889.getClass(), "firstDataVersion", null);
        setField(term4217889, term4217889.getClass(), "firstPlayDate", null);
        setField(term4217889, term4217889.getClass(), "lastGameId", null);
        setField(term4217889, term4217889.getClass(), "lastRomVersion", null);
        setField(term4217889, term4217889.getClass(), "lastDataVersion", null);
        setField(term4217889, term4217889.getClass(), "lastLoginDate", null);
        setField(term4217889, term4217889.getClass(), "lastPlayDate", null);
        setIntField(term4217889, term4217889.getClass(), "lastPlaceId", 0);
        setField(term4217889, term4217889.getClass(), "lastPlaceName", null);
        setField(term4217889, term4217889.getClass(), "lastRegionId", null);
        setField(term4217889, term4217889.getClass(), "lastRegionName", null);
        setField(term4217889, term4217889.getClass(), "lastAllNetId", null);
        setField(term4217889, term4217889.getClass(), "lastClientId", null);
        setField(term4217889, term4217889.getClass(), "lastCountryCode", null);
        setField(term4217889, term4217889.getClass(), "userNameEx", null);
        setField(term4217889, term4217889.getClass(), "compatibleCmVersion", null);
        setIntField(term4217889, term4217889.getClass(), "medal", 0);
        setIntField(term4217889, term4217889.getClass(), "mapIconId", 0);
        setIntField(term4217889, term4217889.getClass(), "voiceId", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarWear", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarHead", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarFace", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarSkin", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarItem", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarFront", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarBack", 0);
        setIntField(term4217889, term4217889.getClass(), "classEmblemBase", 0);
        setIntField(term4217889, term4217889.getClass(), "classEmblemMedal", 0);
        setIntField(term4217889, term4217889.getClass(), "stockedGridCount", 0);
        setIntField(term4217889, term4217889.getClass(), "exMapLoopCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattlePlayCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleWinCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleLoseCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4217889, term4217889.getClass(), "charaIllustId", 0);
        setIntField(term4217889, term4217889.getClass(), "skillId", 0);
        setIntField(term4217889, term4217889.getClass(), "overPowerPoint", 0);
        setIntField(term4217889, term4217889.getClass(), "overPowerRate", 0);
        setIntField(term4217889, term4217889.getClass(), "overPowerLowerRank", 0);
        setIntField(term4217889, term4217889.getClass(), "avatarPoint", 0);
        setIntField(term4217889, term4217889.getClass(), "battleRankId", 0);
        setIntField(term4217889, term4217889.getClass(), "battleRankPoint", 0);
        setIntField(term4217889, term4217889.getClass(), "eliteRankPoint", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattle1stCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattle2ndCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattle3rdCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattle4thCount", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleCorrection", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleErrCnt", 0);
        setIntField(term4217889, term4217889.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4217889, term4217889.getClass(), "battleRewardStatus", 0);
        setIntField(term4217889, term4217889.getClass(), "battleRewardIndex", 0);
        setIntField(term4217889, term4217889.getClass(), "battleRewardCount", 0);
        setIntField(term4217889, term4217889.getClass(), "ext1", 0);
        setIntField(term4217889, term4217889.getClass(), "ext2", 0);
        setIntField(term4217889, term4217889.getClass(), "ext3", 0);
        setIntField(term4217889, term4217889.getClass(), "ext4", 0);
        setIntField(term4217889, term4217889.getClass(), "ext5", 0);
        setIntField(term4217889, term4217889.getClass(), "ext6", 0);
        setIntField(term4217889, term4217889.getClass(), "ext7", 0);
        setIntField(term4217889, term4217889.getClass(), "ext8", 0);
        setIntField(term4217889, term4217889.getClass(), "ext9", 0);
        setIntField(term4217889, term4217889.getClass(), "ext10", 0);
        setField(term4217889, term4217889.getClass(), "extStr1", null);
        setField(term4217889, term4217889.getClass(), "extStr2", null);
        setLongField(term4217889, term4217889.getClass(), "extLong1", 0L);
        setLongField(term4217889, term4217889.getClass(), "extLong2", 0L);
        setField(term4217889, term4217889.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4217889, term4217889.getClass(), "isNetBattleHost", false);
        setIntField(term4217889, term4217889.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattle4thCount", argTypes, term4217889, args);
    }

};


