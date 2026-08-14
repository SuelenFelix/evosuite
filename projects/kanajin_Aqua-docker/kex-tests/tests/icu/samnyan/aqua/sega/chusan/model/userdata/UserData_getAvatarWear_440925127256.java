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

public class UserData_getAvatarWear_440925127256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215810;

    public UserData_getAvatarWear_440925127256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215810 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4215810, term4215810.getClass(), "id", 0L);
        setField(term4215810, term4215810.getClass(), "card", null);
        setField(term4215810, term4215810.getClass(), "userName", null);
        setIntField(term4215810, term4215810.getClass(), "level", 0);
        setIntField(term4215810, term4215810.getClass(), "reincarnationNum", 0);
        setField(term4215810, term4215810.getClass(), "exp", null);
        setLongField(term4215810, term4215810.getClass(), "point", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalPoint", 0L);
        setIntField(term4215810, term4215810.getClass(), "playCount", 0);
        setIntField(term4215810, term4215810.getClass(), "multiPlayCount", 0);
        setIntField(term4215810, term4215810.getClass(), "playerRating", 0);
        setIntField(term4215810, term4215810.getClass(), "highestRating", 0);
        setIntField(term4215810, term4215810.getClass(), "nameplateId", 0);
        setIntField(term4215810, term4215810.getClass(), "frameId", 0);
        setIntField(term4215810, term4215810.getClass(), "characterId", 0);
        setIntField(term4215810, term4215810.getClass(), "trophyId", 0);
        setIntField(term4215810, term4215810.getClass(), "playedTutorialBit", 0);
        setIntField(term4215810, term4215810.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4215810, term4215810.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4215810, term4215810.getClass(), "totalMapNum", 0);
        setLongField(term4215810, term4215810.getClass(), "totalHiScore", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4215810, term4215810.getClass(), "totalUltimaHighScore", 0L);
        setField(term4215810, term4215810.getClass(), "eventWatchedDate", null);
        setIntField(term4215810, term4215810.getClass(), "friendCount", 0);
        setField(term4215810, term4215810.getClass(), "firstGameId", null);
        setField(term4215810, term4215810.getClass(), "firstRomVersion", null);
        setField(term4215810, term4215810.getClass(), "firstDataVersion", null);
        setField(term4215810, term4215810.getClass(), "firstPlayDate", null);
        setField(term4215810, term4215810.getClass(), "lastGameId", null);
        setField(term4215810, term4215810.getClass(), "lastRomVersion", null);
        setField(term4215810, term4215810.getClass(), "lastDataVersion", null);
        setField(term4215810, term4215810.getClass(), "lastLoginDate", null);
        setField(term4215810, term4215810.getClass(), "lastPlayDate", null);
        setIntField(term4215810, term4215810.getClass(), "lastPlaceId", 0);
        setField(term4215810, term4215810.getClass(), "lastPlaceName", null);
        setField(term4215810, term4215810.getClass(), "lastRegionId", null);
        setField(term4215810, term4215810.getClass(), "lastRegionName", null);
        setField(term4215810, term4215810.getClass(), "lastAllNetId", null);
        setField(term4215810, term4215810.getClass(), "lastClientId", null);
        setField(term4215810, term4215810.getClass(), "lastCountryCode", null);
        setField(term4215810, term4215810.getClass(), "userNameEx", null);
        setField(term4215810, term4215810.getClass(), "compatibleCmVersion", null);
        setIntField(term4215810, term4215810.getClass(), "medal", 0);
        setIntField(term4215810, term4215810.getClass(), "mapIconId", 0);
        setIntField(term4215810, term4215810.getClass(), "voiceId", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarWear", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarHead", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarFace", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarSkin", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarItem", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarFront", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarBack", 0);
        setIntField(term4215810, term4215810.getClass(), "classEmblemBase", 0);
        setIntField(term4215810, term4215810.getClass(), "classEmblemMedal", 0);
        setIntField(term4215810, term4215810.getClass(), "stockedGridCount", 0);
        setIntField(term4215810, term4215810.getClass(), "exMapLoopCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattlePlayCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleWinCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleLoseCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4215810, term4215810.getClass(), "charaIllustId", 0);
        setIntField(term4215810, term4215810.getClass(), "skillId", 0);
        setIntField(term4215810, term4215810.getClass(), "overPowerPoint", 0);
        setIntField(term4215810, term4215810.getClass(), "overPowerRate", 0);
        setIntField(term4215810, term4215810.getClass(), "overPowerLowerRank", 0);
        setIntField(term4215810, term4215810.getClass(), "avatarPoint", 0);
        setIntField(term4215810, term4215810.getClass(), "battleRankId", 0);
        setIntField(term4215810, term4215810.getClass(), "battleRankPoint", 0);
        setIntField(term4215810, term4215810.getClass(), "eliteRankPoint", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattle1stCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattle2ndCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattle3rdCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattle4thCount", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleCorrection", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleErrCnt", 0);
        setIntField(term4215810, term4215810.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4215810, term4215810.getClass(), "battleRewardStatus", 0);
        setIntField(term4215810, term4215810.getClass(), "battleRewardIndex", 0);
        setIntField(term4215810, term4215810.getClass(), "battleRewardCount", 0);
        setIntField(term4215810, term4215810.getClass(), "ext1", 0);
        setIntField(term4215810, term4215810.getClass(), "ext2", 0);
        setIntField(term4215810, term4215810.getClass(), "ext3", 0);
        setIntField(term4215810, term4215810.getClass(), "ext4", 0);
        setIntField(term4215810, term4215810.getClass(), "ext5", 0);
        setIntField(term4215810, term4215810.getClass(), "ext6", 0);
        setIntField(term4215810, term4215810.getClass(), "ext7", 0);
        setIntField(term4215810, term4215810.getClass(), "ext8", 0);
        setIntField(term4215810, term4215810.getClass(), "ext9", 0);
        setIntField(term4215810, term4215810.getClass(), "ext10", 0);
        setField(term4215810, term4215810.getClass(), "extStr1", null);
        setField(term4215810, term4215810.getClass(), "extStr2", null);
        setLongField(term4215810, term4215810.getClass(), "extLong1", 0L);
        setLongField(term4215810, term4215810.getClass(), "extLong2", 0L);
        setField(term4215810, term4215810.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4215810, term4215810.getClass(), "isNetBattleHost", false);
        setIntField(term4215810, term4215810.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarWear", argTypes, term4215810, args);
    }

};


