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

public class UserData_hashCode_171100108408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293142;

    public UserData_hashCode_171100108408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293142 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term293142, term293142.getClass(), "id", 0L);
        setField(term293142, term293142.getClass(), "card", null);
        setField(term293142, term293142.getClass(), "userName", null);
        setIntField(term293142, term293142.getClass(), "level", 0);
        setIntField(term293142, term293142.getClass(), "reincarnationNum", 0);
        setField(term293142, term293142.getClass(), "exp", null);
        setLongField(term293142, term293142.getClass(), "point", 0L);
        setLongField(term293142, term293142.getClass(), "totalPoint", 0L);
        setIntField(term293142, term293142.getClass(), "playCount", 0);
        setIntField(term293142, term293142.getClass(), "multiPlayCount", 0);
        setIntField(term293142, term293142.getClass(), "playerRating", 0);
        setIntField(term293142, term293142.getClass(), "highestRating", 0);
        setIntField(term293142, term293142.getClass(), "nameplateId", 0);
        setIntField(term293142, term293142.getClass(), "frameId", 0);
        setIntField(term293142, term293142.getClass(), "characterId", 0);
        setIntField(term293142, term293142.getClass(), "trophyId", 0);
        setIntField(term293142, term293142.getClass(), "playedTutorialBit", 0);
        setIntField(term293142, term293142.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term293142, term293142.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term293142, term293142.getClass(), "totalMapNum", 0);
        setLongField(term293142, term293142.getClass(), "totalHiScore", 0L);
        setLongField(term293142, term293142.getClass(), "totalBasicHighScore", 0L);
        setLongField(term293142, term293142.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term293142, term293142.getClass(), "totalExpertHighScore", 0L);
        setLongField(term293142, term293142.getClass(), "totalMasterHighScore", 0L);
        setLongField(term293142, term293142.getClass(), "totalUltimaHighScore", 0L);
        setField(term293142, term293142.getClass(), "eventWatchedDate", null);
        setIntField(term293142, term293142.getClass(), "friendCount", 0);
        setField(term293142, term293142.getClass(), "firstGameId", null);
        setField(term293142, term293142.getClass(), "firstRomVersion", null);
        setField(term293142, term293142.getClass(), "firstDataVersion", null);
        setField(term293142, term293142.getClass(), "firstPlayDate", null);
        setField(term293142, term293142.getClass(), "lastGameId", null);
        setField(term293142, term293142.getClass(), "lastRomVersion", null);
        setField(term293142, term293142.getClass(), "lastDataVersion", null);
        setField(term293142, term293142.getClass(), "lastLoginDate", null);
        setField(term293142, term293142.getClass(), "lastPlayDate", null);
        setIntField(term293142, term293142.getClass(), "lastPlaceId", 0);
        setField(term293142, term293142.getClass(), "lastPlaceName", null);
        setField(term293142, term293142.getClass(), "lastRegionId", null);
        setField(term293142, term293142.getClass(), "lastRegionName", null);
        setField(term293142, term293142.getClass(), "lastAllNetId", null);
        setField(term293142, term293142.getClass(), "lastClientId", null);
        setField(term293142, term293142.getClass(), "lastCountryCode", null);
        setField(term293142, term293142.getClass(), "userNameEx", null);
        setField(term293142, term293142.getClass(), "compatibleCmVersion", null);
        setIntField(term293142, term293142.getClass(), "medal", 0);
        setIntField(term293142, term293142.getClass(), "mapIconId", 0);
        setIntField(term293142, term293142.getClass(), "voiceId", 0);
        setIntField(term293142, term293142.getClass(), "avatarWear", 0);
        setIntField(term293142, term293142.getClass(), "avatarHead", 0);
        setIntField(term293142, term293142.getClass(), "avatarFace", 0);
        setIntField(term293142, term293142.getClass(), "avatarSkin", 0);
        setIntField(term293142, term293142.getClass(), "avatarItem", 0);
        setIntField(term293142, term293142.getClass(), "avatarFront", 0);
        setIntField(term293142, term293142.getClass(), "avatarBack", 0);
        setIntField(term293142, term293142.getClass(), "classEmblemBase", 0);
        setIntField(term293142, term293142.getClass(), "classEmblemMedal", 0);
        setIntField(term293142, term293142.getClass(), "stockedGridCount", 0);
        setIntField(term293142, term293142.getClass(), "exMapLoopCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattlePlayCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattleWinCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattleLoseCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term293142, term293142.getClass(), "charaIllustId", 0);
        setIntField(term293142, term293142.getClass(), "skillId", 0);
        setIntField(term293142, term293142.getClass(), "overPowerPoint", 0);
        setIntField(term293142, term293142.getClass(), "overPowerRate", 0);
        setIntField(term293142, term293142.getClass(), "overPowerLowerRank", 0);
        setIntField(term293142, term293142.getClass(), "avatarPoint", 0);
        setIntField(term293142, term293142.getClass(), "battleRankId", 0);
        setIntField(term293142, term293142.getClass(), "battleRankPoint", 0);
        setIntField(term293142, term293142.getClass(), "eliteRankPoint", 0);
        setIntField(term293142, term293142.getClass(), "netBattle1stCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattle2ndCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattle3rdCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattle4thCount", 0);
        setIntField(term293142, term293142.getClass(), "netBattleCorrection", 0);
        setIntField(term293142, term293142.getClass(), "netBattleErrCnt", 0);
        setIntField(term293142, term293142.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term293142, term293142.getClass(), "battleRewardStatus", 0);
        setIntField(term293142, term293142.getClass(), "battleRewardIndex", 0);
        setIntField(term293142, term293142.getClass(), "battleRewardCount", 0);
        setIntField(term293142, term293142.getClass(), "ext1", 0);
        setIntField(term293142, term293142.getClass(), "ext2", 0);
        setIntField(term293142, term293142.getClass(), "ext3", 0);
        setIntField(term293142, term293142.getClass(), "ext4", 0);
        setIntField(term293142, term293142.getClass(), "ext5", 0);
        setIntField(term293142, term293142.getClass(), "ext6", 0);
        setIntField(term293142, term293142.getClass(), "ext7", 0);
        setIntField(term293142, term293142.getClass(), "ext8", 0);
        setIntField(term293142, term293142.getClass(), "ext9", 0);
        setIntField(term293142, term293142.getClass(), "ext10", 0);
        setField(term293142, term293142.getClass(), "extStr1", null);
        setField(term293142, term293142.getClass(), "extStr2", null);
        setLongField(term293142, term293142.getClass(), "extLong1", 0L);
        setLongField(term293142, term293142.getClass(), "extLong2", 0L);
        setField(term293142, term293142.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term293142, term293142.getClass(), "isNetBattleHost", false);
        setIntField(term293142, term293142.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term293142, args);
    }

};


