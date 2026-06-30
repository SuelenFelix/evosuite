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

public class UserData_canEqual_1081749196407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293065;

    public UserData_canEqual_1081749196407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293065 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term293065, term293065.getClass(), "id", 0L);
        setField(term293065, term293065.getClass(), "card", null);
        setField(term293065, term293065.getClass(), "userName", null);
        setIntField(term293065, term293065.getClass(), "level", 0);
        setIntField(term293065, term293065.getClass(), "reincarnationNum", 0);
        setField(term293065, term293065.getClass(), "exp", null);
        setLongField(term293065, term293065.getClass(), "point", 0L);
        setLongField(term293065, term293065.getClass(), "totalPoint", 0L);
        setIntField(term293065, term293065.getClass(), "playCount", 0);
        setIntField(term293065, term293065.getClass(), "multiPlayCount", 0);
        setIntField(term293065, term293065.getClass(), "playerRating", 0);
        setIntField(term293065, term293065.getClass(), "highestRating", 0);
        setIntField(term293065, term293065.getClass(), "nameplateId", 0);
        setIntField(term293065, term293065.getClass(), "frameId", 0);
        setIntField(term293065, term293065.getClass(), "characterId", 0);
        setIntField(term293065, term293065.getClass(), "trophyId", 0);
        setIntField(term293065, term293065.getClass(), "playedTutorialBit", 0);
        setIntField(term293065, term293065.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term293065, term293065.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term293065, term293065.getClass(), "totalMapNum", 0);
        setLongField(term293065, term293065.getClass(), "totalHiScore", 0L);
        setLongField(term293065, term293065.getClass(), "totalBasicHighScore", 0L);
        setLongField(term293065, term293065.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term293065, term293065.getClass(), "totalExpertHighScore", 0L);
        setLongField(term293065, term293065.getClass(), "totalMasterHighScore", 0L);
        setLongField(term293065, term293065.getClass(), "totalUltimaHighScore", 0L);
        setField(term293065, term293065.getClass(), "eventWatchedDate", null);
        setIntField(term293065, term293065.getClass(), "friendCount", 0);
        setField(term293065, term293065.getClass(), "firstGameId", null);
        setField(term293065, term293065.getClass(), "firstRomVersion", null);
        setField(term293065, term293065.getClass(), "firstDataVersion", null);
        setField(term293065, term293065.getClass(), "firstPlayDate", null);
        setField(term293065, term293065.getClass(), "lastGameId", null);
        setField(term293065, term293065.getClass(), "lastRomVersion", null);
        setField(term293065, term293065.getClass(), "lastDataVersion", null);
        setField(term293065, term293065.getClass(), "lastLoginDate", null);
        setField(term293065, term293065.getClass(), "lastPlayDate", null);
        setIntField(term293065, term293065.getClass(), "lastPlaceId", 0);
        setField(term293065, term293065.getClass(), "lastPlaceName", null);
        setField(term293065, term293065.getClass(), "lastRegionId", null);
        setField(term293065, term293065.getClass(), "lastRegionName", null);
        setField(term293065, term293065.getClass(), "lastAllNetId", null);
        setField(term293065, term293065.getClass(), "lastClientId", null);
        setField(term293065, term293065.getClass(), "lastCountryCode", null);
        setField(term293065, term293065.getClass(), "userNameEx", null);
        setField(term293065, term293065.getClass(), "compatibleCmVersion", null);
        setIntField(term293065, term293065.getClass(), "medal", 0);
        setIntField(term293065, term293065.getClass(), "mapIconId", 0);
        setIntField(term293065, term293065.getClass(), "voiceId", 0);
        setIntField(term293065, term293065.getClass(), "avatarWear", 0);
        setIntField(term293065, term293065.getClass(), "avatarHead", 0);
        setIntField(term293065, term293065.getClass(), "avatarFace", 0);
        setIntField(term293065, term293065.getClass(), "avatarSkin", 0);
        setIntField(term293065, term293065.getClass(), "avatarItem", 0);
        setIntField(term293065, term293065.getClass(), "avatarFront", 0);
        setIntField(term293065, term293065.getClass(), "avatarBack", 0);
        setIntField(term293065, term293065.getClass(), "classEmblemBase", 0);
        setIntField(term293065, term293065.getClass(), "classEmblemMedal", 0);
        setIntField(term293065, term293065.getClass(), "stockedGridCount", 0);
        setIntField(term293065, term293065.getClass(), "exMapLoopCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattlePlayCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattleWinCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattleLoseCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term293065, term293065.getClass(), "charaIllustId", 0);
        setIntField(term293065, term293065.getClass(), "skillId", 0);
        setIntField(term293065, term293065.getClass(), "overPowerPoint", 0);
        setIntField(term293065, term293065.getClass(), "overPowerRate", 0);
        setIntField(term293065, term293065.getClass(), "overPowerLowerRank", 0);
        setIntField(term293065, term293065.getClass(), "avatarPoint", 0);
        setIntField(term293065, term293065.getClass(), "battleRankId", 0);
        setIntField(term293065, term293065.getClass(), "battleRankPoint", 0);
        setIntField(term293065, term293065.getClass(), "eliteRankPoint", 0);
        setIntField(term293065, term293065.getClass(), "netBattle1stCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattle2ndCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattle3rdCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattle4thCount", 0);
        setIntField(term293065, term293065.getClass(), "netBattleCorrection", 0);
        setIntField(term293065, term293065.getClass(), "netBattleErrCnt", 0);
        setIntField(term293065, term293065.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term293065, term293065.getClass(), "battleRewardStatus", 0);
        setIntField(term293065, term293065.getClass(), "battleRewardIndex", 0);
        setIntField(term293065, term293065.getClass(), "battleRewardCount", 0);
        setIntField(term293065, term293065.getClass(), "ext1", 0);
        setIntField(term293065, term293065.getClass(), "ext2", 0);
        setIntField(term293065, term293065.getClass(), "ext3", 0);
        setIntField(term293065, term293065.getClass(), "ext4", 0);
        setIntField(term293065, term293065.getClass(), "ext5", 0);
        setIntField(term293065, term293065.getClass(), "ext6", 0);
        setIntField(term293065, term293065.getClass(), "ext7", 0);
        setIntField(term293065, term293065.getClass(), "ext8", 0);
        setIntField(term293065, term293065.getClass(), "ext9", 0);
        setIntField(term293065, term293065.getClass(), "ext10", 0);
        setField(term293065, term293065.getClass(), "extStr1", null);
        setField(term293065, term293065.getClass(), "extStr2", null);
        setLongField(term293065, term293065.getClass(), "extLong1", 0L);
        setLongField(term293065, term293065.getClass(), "extLong2", 0L);
        setField(term293065, term293065.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term293065, term293065.getClass(), "isNetBattleHost", false);
        setIntField(term293065, term293065.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term293065, args);
    }

};


