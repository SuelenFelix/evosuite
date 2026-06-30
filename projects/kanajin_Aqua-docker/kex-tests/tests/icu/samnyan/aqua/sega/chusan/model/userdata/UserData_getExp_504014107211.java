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

public class UserData_getExp_504014107211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277821;

    public UserData_getExp_504014107211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term277821, term277821.getClass(), "id", 0L);
        setField(term277821, term277821.getClass(), "card", null);
        setField(term277821, term277821.getClass(), "userName", null);
        setIntField(term277821, term277821.getClass(), "level", 0);
        setIntField(term277821, term277821.getClass(), "reincarnationNum", 0);
        setField(term277821, term277821.getClass(), "exp", null);
        setLongField(term277821, term277821.getClass(), "point", 0L);
        setLongField(term277821, term277821.getClass(), "totalPoint", 0L);
        setIntField(term277821, term277821.getClass(), "playCount", 0);
        setIntField(term277821, term277821.getClass(), "multiPlayCount", 0);
        setIntField(term277821, term277821.getClass(), "playerRating", 0);
        setIntField(term277821, term277821.getClass(), "highestRating", 0);
        setIntField(term277821, term277821.getClass(), "nameplateId", 0);
        setIntField(term277821, term277821.getClass(), "frameId", 0);
        setIntField(term277821, term277821.getClass(), "characterId", 0);
        setIntField(term277821, term277821.getClass(), "trophyId", 0);
        setIntField(term277821, term277821.getClass(), "playedTutorialBit", 0);
        setIntField(term277821, term277821.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term277821, term277821.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term277821, term277821.getClass(), "totalMapNum", 0);
        setLongField(term277821, term277821.getClass(), "totalHiScore", 0L);
        setLongField(term277821, term277821.getClass(), "totalBasicHighScore", 0L);
        setLongField(term277821, term277821.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term277821, term277821.getClass(), "totalExpertHighScore", 0L);
        setLongField(term277821, term277821.getClass(), "totalMasterHighScore", 0L);
        setLongField(term277821, term277821.getClass(), "totalUltimaHighScore", 0L);
        setField(term277821, term277821.getClass(), "eventWatchedDate", null);
        setIntField(term277821, term277821.getClass(), "friendCount", 0);
        setField(term277821, term277821.getClass(), "firstGameId", null);
        setField(term277821, term277821.getClass(), "firstRomVersion", null);
        setField(term277821, term277821.getClass(), "firstDataVersion", null);
        setField(term277821, term277821.getClass(), "firstPlayDate", null);
        setField(term277821, term277821.getClass(), "lastGameId", null);
        setField(term277821, term277821.getClass(), "lastRomVersion", null);
        setField(term277821, term277821.getClass(), "lastDataVersion", null);
        setField(term277821, term277821.getClass(), "lastLoginDate", null);
        setField(term277821, term277821.getClass(), "lastPlayDate", null);
        setIntField(term277821, term277821.getClass(), "lastPlaceId", 0);
        setField(term277821, term277821.getClass(), "lastPlaceName", null);
        setField(term277821, term277821.getClass(), "lastRegionId", null);
        setField(term277821, term277821.getClass(), "lastRegionName", null);
        setField(term277821, term277821.getClass(), "lastAllNetId", null);
        setField(term277821, term277821.getClass(), "lastClientId", null);
        setField(term277821, term277821.getClass(), "lastCountryCode", null);
        setField(term277821, term277821.getClass(), "userNameEx", null);
        setField(term277821, term277821.getClass(), "compatibleCmVersion", null);
        setIntField(term277821, term277821.getClass(), "medal", 0);
        setIntField(term277821, term277821.getClass(), "mapIconId", 0);
        setIntField(term277821, term277821.getClass(), "voiceId", 0);
        setIntField(term277821, term277821.getClass(), "avatarWear", 0);
        setIntField(term277821, term277821.getClass(), "avatarHead", 0);
        setIntField(term277821, term277821.getClass(), "avatarFace", 0);
        setIntField(term277821, term277821.getClass(), "avatarSkin", 0);
        setIntField(term277821, term277821.getClass(), "avatarItem", 0);
        setIntField(term277821, term277821.getClass(), "avatarFront", 0);
        setIntField(term277821, term277821.getClass(), "avatarBack", 0);
        setIntField(term277821, term277821.getClass(), "classEmblemBase", 0);
        setIntField(term277821, term277821.getClass(), "classEmblemMedal", 0);
        setIntField(term277821, term277821.getClass(), "stockedGridCount", 0);
        setIntField(term277821, term277821.getClass(), "exMapLoopCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattlePlayCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattleWinCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattleLoseCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term277821, term277821.getClass(), "charaIllustId", 0);
        setIntField(term277821, term277821.getClass(), "skillId", 0);
        setIntField(term277821, term277821.getClass(), "overPowerPoint", 0);
        setIntField(term277821, term277821.getClass(), "overPowerRate", 0);
        setIntField(term277821, term277821.getClass(), "overPowerLowerRank", 0);
        setIntField(term277821, term277821.getClass(), "avatarPoint", 0);
        setIntField(term277821, term277821.getClass(), "battleRankId", 0);
        setIntField(term277821, term277821.getClass(), "battleRankPoint", 0);
        setIntField(term277821, term277821.getClass(), "eliteRankPoint", 0);
        setIntField(term277821, term277821.getClass(), "netBattle1stCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattle2ndCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattle3rdCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattle4thCount", 0);
        setIntField(term277821, term277821.getClass(), "netBattleCorrection", 0);
        setIntField(term277821, term277821.getClass(), "netBattleErrCnt", 0);
        setIntField(term277821, term277821.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term277821, term277821.getClass(), "battleRewardStatus", 0);
        setIntField(term277821, term277821.getClass(), "battleRewardIndex", 0);
        setIntField(term277821, term277821.getClass(), "battleRewardCount", 0);
        setIntField(term277821, term277821.getClass(), "ext1", 0);
        setIntField(term277821, term277821.getClass(), "ext2", 0);
        setIntField(term277821, term277821.getClass(), "ext3", 0);
        setIntField(term277821, term277821.getClass(), "ext4", 0);
        setIntField(term277821, term277821.getClass(), "ext5", 0);
        setIntField(term277821, term277821.getClass(), "ext6", 0);
        setIntField(term277821, term277821.getClass(), "ext7", 0);
        setIntField(term277821, term277821.getClass(), "ext8", 0);
        setIntField(term277821, term277821.getClass(), "ext9", 0);
        setIntField(term277821, term277821.getClass(), "ext10", 0);
        setField(term277821, term277821.getClass(), "extStr1", null);
        setField(term277821, term277821.getClass(), "extStr2", null);
        setLongField(term277821, term277821.getClass(), "extLong1", 0L);
        setLongField(term277821, term277821.getClass(), "extLong2", 0L);
        setField(term277821, term277821.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term277821, term277821.getClass(), "isNetBattleHost", false);
        setIntField(term277821, term277821.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term277821, args);
    }

};


